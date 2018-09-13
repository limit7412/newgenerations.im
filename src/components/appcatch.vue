<template>
  <div id="appcatch">
    <!-- <h1>なんか何も無いと寂しいので</h1>
    <p>卯月の画像でも貼っておきますね</p> -->
  </div>
</template>

<script>
export default {
  name: 'appcatch',
  data () {
    return {
    }
  }
}
</script>

<style>
body{
  margin: 0;
}

#appcatch{
  text-align: right;
  background: url('/static/img/catch.png') no-repeat top -23vw center;
  background-blend-mode: multiply;
  background-size: cover;
  background-color: #ffffff;
  padding: 5vw 3vw 19vw;
}

#appcatch h1{
  color: #F9F9F9;
  font-size: 3vw;
}

#appcatch p{
  color: #F9F9F9;
  font-size: 1.5vw;
}
</style>
