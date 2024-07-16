const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm85a89/",
            name: "ssm85a89",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm85a89/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "酒店管理系统小程序"
        } 
    }
}
export default base
