<template>

    <v-card outlined>
        <v-card-title>
            Dashboard # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Size" v-model="item.size" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Filename" v-model="item.filename" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="Isindexing" v-model="item.isindexing" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="Isupload" v-model="item.isupload" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="Videourl" v-model="item.videourl" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'DashboardViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/dashboards/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

