let json= [
    {
        "id": "Shrinidhi",  //to create a random id and password so that we can verify if the details given in landing page are correct
        "pass":"123456",
    
       "name":"Nidhi",
        "status":"student",
        "accountNumber":"900980",
        "accountBalance":"700",
        "aadharnumber":"9707979",
        "customerPan":"12345678",
        "contactnumber":"9108454894",
        "customeremail":"nidhi@gmail.com"

    },
    {
        "id":"Shervegar",
        "pass":"654321",
        "name":"SNidhi",
        "status":"employee",
        "accountNumber":"9009806",
        "accountBalance":"7006",
        "aadharnumber":"97079709",
        "customerPan":"123456780",
        "contactnumber":"91084540894",
        "customeremail":"snidhi@gmail.com"
    }
   
    


]

function authentication(){
    
    //read using DOM
        let uid=document.forms['login'].id.value; //next step after creating the JSON details to be taken 
        let upass =document.forms['login'].pass.value; //create ner uid and uname to iterate in for each
      //NEXT STEP is ITERATE the array using for each, map ,group  

      json.forEach((item) => {
        if(item.id == uid && item.pass == upass){  //id password is what we gave in JSON
            window.location.href="http://127.0.0.1:5500/DLTE-Front%20end/DLTE-FE-FEA009-InteractiveLandingLogin-CustomerUseCase/UCJ002home.html"
        }

      })

}