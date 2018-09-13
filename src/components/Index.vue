<template>
  <div class="index">
    <appcatch/>
    <ul class="wrapper">
      <li class="item">
        <readme/>
      </li>
    </ul>
  </div>
</template>

<script>
import appcatch from './appcatch'
import readme from './index/readme'

export default {
  components: {
    appcatch,
    readme
  },
  name: 'index',
  data () {
    return {
    }
  }
}
</script>

<style>
.wrapper{
  list-style-type: none;
  overflow: hidden;
}

@media screen and (min-width:990px){
  .wrapper{
    display: block;
  }
}

#index ul li{
  list-style-type: none;
}
</style>
