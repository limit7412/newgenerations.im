package nav

import react.*
import react.dom.*
import kotlinext.js.*
import kotlinx.html.style

fun RBuilder.nav() {
    div("appnav") {
      nav {
        ul("gnav") {
          li {+"hoge"}
        }
      }
    }
}
