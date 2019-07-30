package nav

import react.*
import react.dom.*
import kotlinext.js.*
import kotlinx.html.style
import kotlin.arrayOf

class Nav : RComponent<RProps, Nav.State>() {
  init {
    state.apply {
      links = arrayOf(
        Link("twitter", "https://twitter.com/qazx7412"),
        Link("imastodon", "https://imastodon.net/@qazx7412"),
        Link("mstdn.jp", "https://mstdn.jp/@qazx7412"),
        Link("github", "https://github.com/limit7412"),
        Link("qiita", "https://qiita.com/qazx7412"),
        Link("lapras", "https://lapras.com/public/8BHGKGL")
      )
    }
  }

  data class Link(
    val name: String,
    val url: String
  )

  interface State: RState {
    var links: Array<Link>
  }

  private fun RBuilder.links () =
    state.links.map {
      li {
        a(href = it.url) {+it.name}
      }
    }

  override fun RBuilder.render() {
    div("appnav") {
      nav {
        ul("gnav") {links()}
      }
    }
  }
}

fun RBuilder.nav() = child(Nav::class) {}