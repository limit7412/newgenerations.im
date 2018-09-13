<template>
  <div id="readme">
    <h2>readme</h2>
      <h3>このサイトについて</h3>
      <p>勢いでドメイン取っちゃったの過去の習作をいじって作った</p>
      <p>naumanniをArukas上で動かしていたが流石に動かなすぎてしんどくなってやめました…</p>
      <h3>連絡先</h3>
      <h4>一応アカウントとか載せておきます</h4>
      <ul>
        <li>mastodon:@qazx7412@imastodon.net</li>
        <li>twitter:@qazx7412</li>
        <li>discard:kairox(qazx7412)</li>
      </ul>
  </div>
</template>

<script>
export default {
  name: 'readme',
  data () {
    return {
    }
  }
}
</script>

<style>

#readme h2{
  font-size: 30px;
  border-left: 5px solid #4682B4;
  padding: 5px;
  font-weight: normal;
}

#readme h3{
  border-bottom: 1px solid #4682B4;
  margin-left: 5px;
  padding-left: 5px;
  width: 60vw;
  font-weight: normal;
}

#readme p{
  margin-left: 20px;
  margin-right: 10vw;
}

#readme h4{
  margin-left: 20px;
  font-weight: normal;
}

#readme ul li{
  list-style-type: none;
}
</style>
