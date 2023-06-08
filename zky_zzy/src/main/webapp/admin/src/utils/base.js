const base = {
    get() {
        return {
            url : "http://localhost:8080/zky_zzy/",
            name: "zky_zzy",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zky_zzy/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园团购小程序"
        } 
    }
}
export default base
