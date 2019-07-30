package links

import react.*
import react.dom.*
import kotlinext.js.*
import kotlinx.html.style
import kotlin.js.Json

class Links : RComponent<RProps, RState>() {
  // private fun RBuilder.timeline () =

  override fun RBuilder.render() {
    div("links") {
      h2 {+"link"}
      p {
        a(href = "http://abe7usa3.firebird.jp") {
          img(src = "/img/usaminenter.jpg") {}
        }
      }
      p {
        // timeline()
      }
    }
  }
}

fun RBuilder.links() = child(Links::class) {}

