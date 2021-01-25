package tr.com.amazon.scripts;

public enum JsScripts {

    PARENT_OF_ELEMENT("return arguments[0].parentNode;"), //return arguments[0].parentNode;
    ;

    private final String script ;


    JsScripts(String s) {
        this.script = s ;
    }

    @Override
    public String toString(){
        return script;
    }



}
