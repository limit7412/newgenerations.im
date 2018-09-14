<template>
  <div id="links">
    <h2>link</h2>
      <p>
        <a href="http://abe7usa3.firebird.jp"><img src="/static/img/usaminenter.jpg"></a>
      </p>
      <p>
        <Timeline :id="'qazx7412'" :sourceType="'itmeline'" :options="{ theme: 'light' }"/>
      </p>
  </div>
</template>

<script>
import Timeline from 'vue-tweet-embed/timeline'

export default {
  components: {
    Timeline
  },
  name: 'links',
  data () {
    return {
    }
  }
}
</script>

<style>
#links h2{
  font-size: 30px;
  border-left: 5px solid #4682B4;
  padding: 5px;
  font-weight: normal;
}

#links h3{
  border-bottom: 1px solid #4682B4;
  margin-left: 5px;
  padding-left: 5px;
  width: 60vw;
  font-weight: normal;
}

#links p{
  margin-left: 20px;
  margin-right: 10vw;
}

#links h4{
  margin-left: 20px;
  font-weight: normal;
}

a:link{
  color: #00BFFF;
}
a:visited{
  color: #1E90FF;
}
</style>
