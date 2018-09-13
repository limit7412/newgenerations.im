<template>
  <div id="app">
    <appheader/>
    <appnav/>
    <router-view/>
  </div>
</template>

<script>
import appheader from './components/appheader'
import appnav from './components/appnav'

export default {
  components: {
    appheader,
    appnav
  },
  name: 'app'
}
</script>

<style>
</style>
