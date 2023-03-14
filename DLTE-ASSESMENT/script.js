let json= [
    {
        "id": "Shrinidhi",  //to create a random id and password so that we can verify if the details given in landing page are correct
        "pass":"123456",
    
       

    },
    {
        "id":"Shervegar",
        "pass":"654321",
        
    }
   
    


]

function authentication(){
    
    //read using DOM
        let uid=document.forms['login'].id.value; //next step after creating the JSON details to be taken 
        let upass =document.forms['login'].pass.value; //create ner uid and uname to iterate in for each
      //NEXT STEP is ITERATE the array using for each, map ,group  

      json.forEach((item) => {
        if(item.id == uid && item.pass == upass){  //id password is what we gave in JSON
            window.location.href="http://127.0.0.1:5500/DLTE-ASSESSMENT2/task.html"
        }

      })

}