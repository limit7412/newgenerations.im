<template>
  <div id="header">
    <h1>{{ title }}</h1>
    <h2>{{ name }}</h2>
    <p>勢いでドメイン取っちゃったんだけどなにしよ…</p>
    <p>なんもアイディア思いつかない</p>
    <!-- <router-view/> -->
  </div>
</template>

<script>
export default {
  name: 'header',
  data () {
    return {
      title: 'new generations',
      name: 'qazx7412,kairox,回路'
    }
  }
}
</script>

<style>
body{
  margin: 0;
}

#header{
  text-align: center;
  line-height: 1;
  padding: 4.2vw 16.8vw 0.84vw;  /*あとで変える 50px 200px 10px*/
  background: url('/static/hed.png') center center;
  background-blend-mode: multiply;
  background-size: cover;
  background-color: #b5b5b5 ;
}

#header h1{
  font-size: 3.5vw;
  color: #FFFFFF;
  line-height: 0;
  font-weight: normal;
}

#header h2{
  font-size: 2vw;
  color: #FFFFFF;
  line-height: 2;
  font-weight: normal;
}

#header p{
  font-size: 1vw;
  color: #FFFFFF;
  line-height: 0;
  font-weight: normal;
}

@media screen and (max-width:990px) {
  #header p{
    display: none;
  }
}
</style>
