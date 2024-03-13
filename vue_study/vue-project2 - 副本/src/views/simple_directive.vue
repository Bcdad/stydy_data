<template>
    <div>
        <div v-if="a > 0">hello</div>
        <div v-else>world</div>
        <input type="button" value="点击一下试试" @click="count">
    </div>
</template>  
<script>
// const axios=require('axios')
export default {
    data() {
        return {
            a: 1
        }
    },
    methods: {
        count: function () {
            this.a = this.a === 1 ? 0 : 1;
        }
    }
}
</script>