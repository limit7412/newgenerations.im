package links

import react.*
import react.dom.*
import kotlinext.js.*
import kotlinx.html.style

fun RBuilder.links() {
    div("links") {
      h2 {+"link"}
      p {
        a(href = "http://abe7usa3.firebird.jp") {
          img(src = "/img/usaminenter.jpg") {}
        }
      }
      p {
      }
    }
}
