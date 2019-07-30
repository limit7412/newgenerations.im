package app

import react.*
import react.dom.*
import header.*
import nav.*
import catch.*
import readme.*
import product.*
import links.*

class App : RComponent<RProps, RState>() {
  override fun RBuilder.render() {
    div("App-header") {
      header()
      nav()
      catch()
      ul("wrapper") {
        li("item") {
          readme()
          product()
        }
        li("sbar") {
          links()
        }
      }
    }
  }
}

fun RBuilder.app() = child(App::class) {}
