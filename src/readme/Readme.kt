package readme

import react.*
import react.dom.*
import kotlinext.js.*
import kotlinx.html.style

fun RBuilder.readme() {
    div("readme") {
      h2 {+"readme"}
      h3 {+"このサイトについて"}
      p {+"勢いでドメイン取っちゃったの過去の習作をいじって作った"}
      p {+"移植に移植を重ね現在Kotlin/Jsで稼働中"}
      h3 {+"連絡先"}
      h4 {+"一応アカウントとか載せておきます"}
      ul {
        li {+"mastodon:@qazx7412@imastodon.net"}
        li {+"twitter:@qazx7412"}
        li {+"discard:kairox(qazx7412)"}
      }
    }
}
