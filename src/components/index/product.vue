<template>
  <div id="product">
    <h2>product</h2>
      <h3>個人slackNGs化計画</h3>
      <p>個人のslackのWorkspaceにうづりんみおなbotをデプロイしていく事によって幸せになろうという計画</p>
      <h4>実装済み</h4>
      <ul>
        <li v-for="(bot, key, index) in bots.done" :key="index">
          #{{ bot.channel }}  <a :href=bot.repository>{{ bot.text }}</a>
        </li>
      </ul>
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
bots = {
  done: [
    {
      channel: 'github',
      text: 'うづりんがgithubの通知を教えてくれる',
      repository: 'https://github.com/limit7412/github_notifications_slack'
    },
    {
      channel: 'monitoring',
      text: 'Mackerelからの通知を受けて未央が教えてくれる（通知機能そのまま）',
      repository: ''
    }
  ],
  wip: [
    {
      channel: '（未定）',
      text: 'ssを呼んでて名前から顔が出てこないときに教えてくれるコマンド',
      repository: 'https://github.com/limit7412/slackpixivdicsearch'
    }
  ],
  plan: [
    'うづりんssを検知して未央に教えてほしい',
    'でれポの検知をもう少しうまくできないかな…',
    'ToDoの通知をNGsがしてくれればモチベ爆上げなのでは'
  ]
}

export default {
  name: 'product',
  data () {
    return {
      bots: bots,

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
