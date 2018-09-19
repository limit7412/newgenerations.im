<template>
  <div id="product">
    <h2>product</h2>
      <h3>個人slackNGs化計画</h3>
      <p>個人のslackのWorkspaceにうづりんみおなbotをデプロイしていく事によって優勝しようという計画</p>
      <h4>着手済み</h4>
      <table>
        <tbody v-for="(bot, key, index) in bots.done" :key="index">
          <th>#{{ bot.channel }}</th>
          <td v-if="bot.repository"><a :href=bot.repository>{{ bot.text }}</a></td>
          <td v-else>{{ bot.text }}</td>
        </tbody>
      </table>
      <h4>着手中</h4>
      <table>
        <tbody v-for="(bot, key, index) in bots.wip" :key="index">
          <th>#{{ bot.channel }}</th>
          <td><a :href=bot.repository>{{ bot.text }}</a></td>
        </tbody>
      </table>
      <h4>未着手</h4>
      <ul>
        <li v-for="(bot, key, index) in bots.plan" :key="index">
          {{ bot }}
        </li>
      </ul>
      <h3>その他リポジトリ</h3>
      <table>
        <tbody v-for="(repository, key, index) in repositorys" :key="index">
          <td><a :href=repository.link>{{ repository.name }}</a></td>
          <td>{{ repository.text }}</td>
        </tbody>
      </table>
  </div>
</template>

<script>
const bots = {
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
    'でれポの検知をもう少しうまくできないかな…'
  ]
}

const repositorys = [
  {
    name: 'newgenerations.im',
    text: 'このページのソース',
    link: 'https://github.com/limit7412/newgenerations.im'
  },
  {
    name: 'stripe_prototype',
    text: '業務でstripeを使うことになったのでそのプロトタイプ',
    link: 'https://github.com/limit7412/stripe_prototype'
  },
  {
    name: 'serverlesshellocrystal',
    text: 'lambdaでcrystalが動かないか試してみて失敗した残骸（どこかでqiitaあたりで記事にしたい…）',
    link: 'https://github.com/limit7412/serverlesshellocrystal'
  },
  {
    name: 'running_event',
    text: 'jquery秀作、ボタンを押すと石を割ってイベントを走る事ができるだけのゲーム（？）',
    link: 'https://github.com/limit7412/running_eventm'
  },
  {
    name: 'simple_echo_crystal',
    text: 'crystal（とrubuy）の勉強のために作ったwebサーバー、車輪の再開発',
    link: 'https://github.com/limit7412/simple_echo_crystalm'
  },
  {
    name: 'iTunesmasterillumination',
    text: 'node.js秀作、iTunesの再生中の情報からアーティスト情報を取り出してアイマスのサイリウムの色に対応させる',
    link: 'https://github.com/limit7412/running_eventm'
  }
]

export default {
  name: 'product',
  data () {
    return {
      bots: bots,
      repositorys: repositorys
    }
  }
}
</script>

<style>

#product h2{
  font-size: 30px;
  border-left: 5px solid #4682B4;
  padding: 5px;
  font-weight: normal;
}

#product h3{
  border-bottom: 1px solid #4682B4;
  margin-left: 5px;
  padding-left: 5px;
  width: 60vw;
  font-weight: normal;
}

#product p{
  margin-left: 20px;
  margin-right: 10vw;
}

#product h4{
  margin-left: 20px;
  font-weight: normal;
}

#product ul li{
  list-style-type: none;
}

#product table{
  margin-left: 2vw;
  margin-right: 0.5vw;
}
</style>
