package product

import react.*
import react.dom.*
import kotlinext.js.*
import kotlinx.html.style
import kotlin.arrayOf

class Product : RComponent<RProps, Product.State>() {
  init {
    state.apply {
      repositorys = arrayOf(
        Repository(
          "github_notifications_slack",
          "https://github.com/limit7412/github_notifications_slack",
          text = "うづりんがgithubの通知を教えてくれるslack bot"
        ),
        Repository(
          "analytics_notifications_slack",
          "https://github.com/limit7412/analytics_notifications_slack",
          text = "Google Analyticsのpv数を集計してランキングで通知するslack bot"
        ),
        Repository(
          "curriculum_vitae",
          "https://github.com/limit7412/curriculum_vitae",
          text = "オープン職務経歴書"
        ),
        Repository(
          "new_channel_notify_slack",
          "https://github.com/limit7412/new_channel_notify_slack",
          text = "新しいチャンネル作成を検知して通知してくれるslack bot"
        ),
        Repository(
          "lambda-crystal-sls",
          "https://github.com/limit7412/lambda-crystal-sls",
          text = "Serverless FrameworkでCrystalを動作させるための自作custom runtime"
        ),
        Repository(
          "newgenerations.im",
          "https://github.com/limit7412/newgenerations.im",
          text = "このページのリポジトリ"
        ),
        Repository(
          "slacknicodicsearch",
          "https://github.com/limit7412/slacknicodicsearch",
          text = "ニコニコ大百科からスクレイピングして結果を教えてくれるslack command"
        ),
        Repository(
          "running_event",
          "https://github.com/limit7412/running_event",
          "https://limit7412.github.io/running_event",
          "ソシャゲのイベントを永遠に走ることが出来るゲーム（?）。htmlの習作"
        ),
        Repository(
          "iTunesmasterillumination",
          "https://github.com/limit7412/iTunesmasterillumination",
          text = "iTunesでアイマス曲を流すとアーティスト情報から画面に色を出してくれる"
        )
      )

      writes = arrayOf(
        Write(
          "vue-cli + axios でmock環境を雑に作ったのでメモ",
          "qiita",
          "https://qiita.com/qazx7412/items/b52b5e818c226f1b5a21"
        ),
        Write(
          "ServerlessFrameworkとLambdaでサーバーレスCrystalしてみた話改めCustomRuntimeでCrystal動かしてみた話",
          "qiita",
          "https://qiita.com/qazx7412/items/5054331183f8655f541c"
        ),
        Write(
          "crystal試すのにsocketでwebサーバーを書いてみた",
          "qiita",
          "https://qiita.com/qazx7412/items/f4796bcfcb4d8400a0a3"
        )
      )
    }
  }

  data class Repository(
    val name: String,
    val repo_url: String,
    val pro_url: String = "",
    val text: String = ""
  )

  data class Write(
    val name: String,
    val media: String,
    val url: String
  )

  interface State: RState {
    var repositorys: Array<Repository>
    var writes: Array<Write>
  }

  private fun RBuilder.repositorys () =
    state.repositorys.map {
      tr {
        td {
          a(href = it.repo_url) {+it.name}
        }
        td {+it.text}
      }
    }

  private fun RBuilder.writes () =
    state.writes.map{
      li {
        a(href = it.url) {+"${it.name} (${it.media})"}
      }
    }

  override fun RBuilder.render() {
    div("product") {
      h2 {+"product"}
      h3 {+"githubリポジトリ"}
      table {
        tbody {repositorys()}
      }
      h3 {+"執筆"}
      ul {writes()}
    }
  }
}

fun RBuilder.product() = child(Product::class) {}
