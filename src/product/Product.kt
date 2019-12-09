package product

import kotlin.arrayOf
import kotlinext.js.*
import react.*
import react.dom.*

class Product : RComponent<RProps, Product.State>() {
  init {
    state.apply {
      repositorys = arrayOf(
        Repository(
          "lambda-nim-sls",
          "https://github.com/limit7412/lambda-nim-sls",
          text = "Serverless Frameworkでnimを動作させるための自作custom runtime（アイマスハッカソン2019参加作品）"
        ),
        Repository(
          "weather-notifications",
          "https://github.com/limit7412/weather-notifications",
          text = "ウェザロさんが雨が振りそうな日に通知してくれるdiscord bot"
        ),
        Repository(
          "lambda_dart_sls",
          "https://github.com/limit7412/lambda_dart_sls",
          text = "Serverless FrameworkでDartを動作させるための自作custom runtime"
        ),
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
          "テックブログのpv数ランキングをアイドルが通知してくれるslack botをLambda + Goで作った話",
          "Media Do Tech Do Blog",
          "https://techdo.mediado.jp/entry/2019/12/06/090000"
        ),
        Write(
          "サーバーレスCrystalのための自作Custom Runtimeを改良した話",
          "qiita",
          "https://qiita.com/qazx7412/items/151b2e9375e63c7a400d"
        ),
        Write(
          "新電子書籍流通システムのアーキテクチャを解説",
          "Media Do Tech Do Blog",
          "https://techdo.mediado.jp/entry/2019/10/29/090000"
        ),
        Write(
          "AWS LambdaをAWS CodePipelineで自動デプロイできるようにしてみよう",
          "Tech Do Book Vol.2 （技術書展7）",
          "https://techdo.booth.pm/items/1548926"
        ),
        Write(
          "AWS LambdaのCustom RuntimeでサーバーレスDartしてみた",
          "qiita",
          "https://qiita.com/qazx7412/items/8bda5d97614d272ed829"
        ),
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

  interface State : RState {
    var repositorys: Array<Repository>
    var writes: Array<Write>
  }

  private fun RBuilder.repositorys() =
    state.repositorys.map {
      tr {
        td {
          a(href = it.repo_url) { +it.name }
        }
        td { +it.text }
      }
    }

  private fun RBuilder.writes() =
    state.writes.map {
      tr {
        td {
          a(href = it.url) { +it.name }
        }
        td { +it.media }
      }
    }

  override fun RBuilder.render() {
    div("product") {
      h2 { +"product" }
      h3 { +"githubリポジトリ" }
      table {
        tbody { repositorys() }
      }
      h3 { +"執筆" }
      ul { writes() }
    }
  }
}

fun RBuilder.product() = child(Product::class) {}
