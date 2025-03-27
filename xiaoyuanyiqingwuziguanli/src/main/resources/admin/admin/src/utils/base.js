const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoyuanyiqingwuziguanli/",
            name: "xiaoyuanyiqingwuziguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoyuanyiqingwuziguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学校防疫物资管理平台"
        } 
    }
}
export default base
