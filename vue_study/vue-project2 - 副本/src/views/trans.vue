<template>
    <div>
        <input type="text" v-model="word" /><br>
        <button @click="trans">trans</button>
        <div>{{ eng }}</div>
        <div>{{ pho }}</div>
        <div>{{ chn }}</div>
        <div>{{ sen1 }}</div>
        <div>{{ sen2 }}</div>
    </div>
</template>
<script>
export default{
    data(){
        return {
            username:'xin',
            word:'',
            eng:'',
            chn:'',
            pho:'',
            sen1:'',
            sen2:''
        }
    },
    methods:{
        trans:function(){
            fetch('http://127.0.0.1:8080/api/v1.0', {
                method: ['POST'],
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    word:this.word,
                    hold: 'no',
                    username: 'xin'
                })
            })
            .then(response => response.json())
                .then(data => {
                    console.log(data)
                    this.eng=data['english']
                    this.pho = data['phonetic']
                    this.chn = data['chinese']
                    this.sen1 = data['sentence1']
                    this.sen2 = data['sentence2']
                })
                .catch((error) => {
                    console.error('Error', error)
                })
        }

    }

}
</script>