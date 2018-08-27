package actions.general

class Wait{
  
  public run(def params){
    if(params.Seconds){
        // this is some random oneline comment
    	sleep(params.Seconds.toInteger() * 1000)  
    }    
  }
}