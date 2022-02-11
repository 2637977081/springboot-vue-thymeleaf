let app = new Vue({
  el: '#app',
  data: {
    title: "欢迎使用",
    description: "开始学习吧",
    isCollapse: false,
    tableData:[],
  },
  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    }
  },
  created: function () {
  },
  mounted: function () {

    const item = {
      date: '2016-05-02',
      name: '王小虎',
      address: '上海市普陀区金沙江路 1518 弄'
    };
    tableData: Array(20).fill(item);
  },
  //变量监控
  watch: {}
});