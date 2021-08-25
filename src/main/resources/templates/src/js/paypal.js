paypal.Buttons({
    Style:{
        shape:pill;
    },
    createOrder:function(data,actions){
        return actions.order.create({
            purchase_units:[{
                amount:{
                    value:'70'
                }
            }]
        });
    },
    OnApprove: function(data, actions){
        return actions.order.capture().then(
            function(details){
                console.log(details);
            }
        )
    }
}).render('.paypal');
console.log("DUNSDADADQWEADADASDADQWEQWESAD");