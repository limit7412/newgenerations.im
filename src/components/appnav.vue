<template>
  <div id="appnav">
    <nav>
      <ul class="gnav">
        <li v-for="(link, key, index) in links" :key="index">
          <a :href=link.url>{{ link.name }}</a>
        </li>
      </ul>
    </nav>
  </div>
</template>

<script>
export default {
  data () {
    return {
      links: [
        {
          name: 'twitter',
          url: 'https://twitter.com/qazx7412'
        },
        {
          name: 'imastodon',
          url: 'https://imastodon.net/@qazx7412'
        },
        {
          name: 'mstdn.jp',
          url: 'https://mstdn.jp/@qazx7412'
        },
        {
          name: 'github',
          url: 'https://github.com/limit7412'
        },
        {
          name: 'gitlab',
          url: 'https://gitlab.com/qazx7412'
        },
        {
          name: '走るゲーム',
          url: 'running_event/index.html'
        },
        {
          name: 'exit',
          url: 'https://imastodon.net/'
        }
      ]
    }
  }

}
</script>

<style>
body{
  margin: 0;
}

.gnav{
  margin-top: 3px;
  margin-bottom: 3px;
  text-align: center;
  display: flex !important;
  list-style-type: none;
  font-weight:bold;
  font-weight: normal;
}

.gnav li a{
  display: block;
  padding: 10px 8px;
  color: #000;
  text-decoration: none;
  font-size: 1.4vw;
  font-weight: normal;
}

</style>
