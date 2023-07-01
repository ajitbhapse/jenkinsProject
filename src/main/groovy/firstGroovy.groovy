def exampleMethod() {
    return ["12","13","14"]
}

def otherExampleMethod() {
    def get = new URL("https://httpbin.org/get").openConnection();
    def getRC = get.getResponseCode();
    println(getRC);
    if (getRC.equals(200)) {
        println(get.getInputStream().getText());
    }
}
return this