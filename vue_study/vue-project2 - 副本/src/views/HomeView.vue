<template>
  <div>
    this is home page
  </div>
  <router-link to="/about">about</router-link><br>
  <router-link to="/test1">test1</router-link><br>
  <input type="text" v-model="username" />
  <router-link :to="{name:'User',params:{username: username}}">test1</router-link><br>
  <comp></comp>
  <router-link to="/trans">trans</router-link>

  
</template>
<script>
import comp from '@/components/comp.vue'
export default{
  data(){
    return {
      username:'hello'
    }
  },                                                                                                                                                              
  components:{
    comp
  }
}
</script>
