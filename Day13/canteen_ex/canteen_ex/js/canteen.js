 var billAmount = 0;
        var isSelected = 0;
        var gVal = 0;

        //function getPrice2() {
        //    if (frmRestaurant.chkItem2.checked == true) {
        //        var num1 = Number(document.getElementById("item2price").textContent);
        //        //   alert(num1);
        //        billAmount += num1;
        //    }
        //    //  alert(document.getElementById("restaurant").textContent);
           
        //    document.getElementById("billAmount").innerHTML = billAmount;
        //}

        function getPrice3() {
			var num1 = Number(document.getElementById("item3price").textContent);
			gVal = num1;
             if (frmRestaurant.chkItem3.checked == true) {
                isSelected = 1;
            // alert(num1);
            billAmount += num1;
			} else {
                //if (isSelected == 1) {
                   // alert("Hi");
                  //  alert(gVal);
                    billAmount = billAmount - gVal;
                    //  alert(billAmount);
                    isSelected = 0;
                    gVal = 0;
                //}
            }
            //  alert(document.getElementById("restaurant").textContent);
           
            document.getElementById("billAmount").innerHTML = billAmount;
        }
        

        function getPrice4() {
			var num1 = Number(document.getElementById("item4price").textContent);
			gVal = num1;
            if (frmRestaurant.chkItem4.checked == true) {
                isSelected = 1;
            // alert(num1);
            billAmount += num1;
			} else {
                //if (isSelected == 1) {
                   // alert("Hi");
                  //  alert(gVal);
                    billAmount = billAmount - gVal;
                    //  alert(billAmount);
                    isSelected = 0;
                    gVal = 0;
                //}
            }
            //  alert(document.getElementById("restaurant").textContent);
           
            document.getElementById("billAmount").innerHTML = billAmount;
        }
        

        function getPrice5() {
			var num1 = Number(document.getElementById("item5price").textContent);
			gVal = num1;
            if (frmRestaurant.chkItem5.checked == true) {
                isSelected = 1;
            // alert(num1);
            billAmount += num1;
			 } else {
                //if (isSelected == 1) {
                   // alert("Hi");
                  //  alert(gVal);
                    billAmount = billAmount - gVal;
                    //  alert(billAmount);
                    isSelected = 0;
                    gVal = 0;
                //}
            }
            //  alert(document.getElementById("restaurant").textContent);
           
            document.getElementById("billAmount").innerHTML = billAmount;
        }
       

        function getPrice6() {
		var num1 = Number(document.getElementById("item6price").textContent);
		gVal = num1;
            if (frmRestaurant.chkItem6.checked == true) {
                isSelected = 1;
            // alert(num1);
            billAmount += num1;
			 } else {
                //if (isSelected == 1) {
                   // alert("Hi");
                  //  alert(gVal);
                    billAmount = billAmount - gVal;
                    //  alert(billAmount);
                    isSelected = 0;
                    gVal = 0;
                //}
            }
            //  alert(document.getElementById("restaurant").textContent);
           
            document.getElementById("billAmount").innerHTML = billAmount;
        }

        function getPrice7() {
           var num1 = Number(document.getElementById("item7price").textContent);
		   gVal = num1;
		   if (frmRestaurant.chkItem7.checked == true) {
            isSelected = 1;
            // alert(num1);
            billAmount += num1;
			 } else {
                //if (isSelected == 1) {
                   // alert("Hi");
                  //  alert(gVal);
                    billAmount = billAmount - gVal;
                    //  alert(billAmount);
                    isSelected = 0;
                    gVal = 0;
                //}
            }
            //  alert(document.getElementById("restaurant").textContent);
           
            document.getElementById("billAmount").innerHTML = billAmount;
        }

        function getPrice1() {
            var num1 = Number(document.getElementById("item1price").textContent);
            gVal = num1;
			if (frmRestaurant.chkItem1.checked == true) {
                isSelected = 1;
                //alert(num1);
                billAmount += num1;
            } else {
                //if (isSelected == 1) {
                   // alert("Hi");
                  //  alert(gVal);
                    billAmount = billAmount - gVal;
                    //  alert(billAmount);
                    isSelected = 0;
                    gVal = 0;
                //}
            }
            //  alert(document.getElementById("restaurant").textContent);
           
            document.getElementById("billAmount").innerHTML = billAmount;
        }

        function getPrice2() {
            var num1 = Number(document.getElementById("item2price").textContent);
            gVal = num1;
			if (frmRestaurant.chkItem2.checked == true) {
                isSelected = 1;
                // alert(num1);
                billAmount += num1;
            } else {
                //if (isSelected == 1) {
                    // alert("Hi");
                    //  alert(gVal);
                    billAmount = billAmount - gVal;
                    //  alert(billAmount);
                    isSelected = 0;
                    gVal = 0;
                //}
            }
            //  alert(document.getElementById("restaurant").textContent);

           document.getElementById("billAmount").innerHTML = billAmount;
        }
		
		function getPrice8() {
			var num1 = Number(document.getElementById("item8price").textContent);     
			gVal = num1;			
			if (frmRestaurant.chkItem8.checked == true) {
               isSelected = 1;
               billAmount += num1;
			} else {
			//if (isSelected == 1) {
                   // alert("Hi");
                  //  alert(gVal);
                    billAmount = billAmount - gVal;
                    //  alert(billAmount);
                    isSelected = 0;
                    gVal = 0;
                //}
            }
            document.getElementById("billAmount").innerHTML = billAmount;
        }

		var restaurantArray = new Array("Ohris", "Chutneys", "Taj", "Banjara",
            "BBQ", "Paradise", "Kritunga", "Mefil");
var bg_image = new Array("url('images/rest.jpg')", "url('images/rest1.jpg')",
    "url('images/rest3.jpg')", "url('images/rest4.jpg')", "url('images/rest5.jpg')",
    "url('images/rest6.jpg')", "url('images/rest7.jpg')", "url('images/rest8.jpg')");
		var tb_color = new Array("#00ff00", "Coral", "Crimson", "DeepPink", "Tomato", "IndianRed", "Yellow", "OrangeRed");
        var i = 0;
        var count = restaurantArray.length;
        var menu = new Array(count);
        var priceArray = new Array(count);
        for (var p = 0; p < count; p++) {
            menu[p] = new Array(8);
        }
        for (var q = 0; q < count; q++) {
            priceArray[q] = new Array(8);
        }
        function load() {
            //if (i == 0) { document.body.style.backgroundImage = "url('rest.jpg')"; }
            //if (i == 1) { document.body.style.backgroundImage = "url('rest1.jpg')"; }
            //if (i == 2) { document.body.style.backgroundImage = "url('rest3.jpg')"; }
            //if (i == 3) { document.body.style.backgroundImage = "url('rest4.jpg')"; }
            //if (i == 4) { document.body.style.backgroundImage = "url('rest7.jpg')"; }
            //if (i == 5) { document.body.style.backgroundImage = "url('rest5.jpg')"; }
            //if (i == 6) { document.body.style.backgroundImage = "url('rest6.jpg')"; }
            //if (i == 7) { document.body.style.backgroundImage = "url('rest4.jpg')"; }       
			document.body.style.backgroundImage = bg_image[i];
			document.getElementById("mytable").style.background = tb_color[i];
			document.getElementById("restaurant").innerHTML = restaurantArray[i];
            document.getElementById("item1").innerHTML = menu[i][0];
            document.getElementById("item2").innerHTML = menu[i][1];
            document.getElementById("item3").innerHTML = menu[i][2];
            document.getElementById("item4").innerHTML = menu[i][3];
            document.getElementById("item5").innerHTML = menu[i][4];
            document.getElementById("item6").innerHTML = menu[i][5];
            document.getElementById("item7").innerHTML = menu[i][6];
            document.getElementById("item8").innerHTML = menu[i][7];

            document.getElementById("item1price").innerHTML = priceArray[i][0];
            document.getElementById("item2price").innerHTML = priceArray[i][1];
            document.getElementById("item3price").innerHTML = priceArray[i][2];
            document.getElementById("item4price").innerHTML = priceArray[i][3];
            document.getElementById("item5price").innerHTML = priceArray[i][4];
            document.getElementById("item6price").innerHTML = priceArray[i][5];
            document.getElementById("item7price").innerHTML = priceArray[i][6];
            document.getElementById("item8price").innerHTML = priceArray[i][7];

        }
		function clear_data() {
		     document.getElementById("frmRestaurant").reset();
			 billAmount = 0
			 document.getElementById("billAmount").innerHTML = billAmount;
		}
        function next() {
            i++;
            if (i == count) {
                alert("No Values After this...");
                return;
            }
            clear_data();
			load();
        }
        function previous() {
            i--;
            if (i < 0) {
                alert("No values Before this...");
                return;
            }
			clear_data()
            load();
        }
        menu[0][0] = "Veg Biryani";
        menu[0][1] = "Chiken Biryani";
        menu[0][2] = "Butter Nan";
        menu[0][3] = "Chiken 65";
        menu[0][4] = "Paneer Butter Masala";
        menu[0][5] = "Lolly Biryani";
        menu[0][6] = "Fry Peace Chicken Biryani";
        menu[0][7] = "Mutton Biryani";

        menu[1][0] = "Dosa";
        menu[1][1] = "Babai Idly";
        menu[1][2] = "Upma Poori";
        menu[1][3] = "Three Short Utappam";
        menu[1][4] = "MLA Pesarattu";
        menu[1][5] = "70 MM Dosa";
        menu[1][6] = "Ghee Karam Dosa";
        menu[1][7] = "Corn Dosa";
		
		menu[2][0] = "Puri Bhaji";
        menu[2][1] = "Aloo Parantha";
        menu[2][2] = "Steamed Idli";
        menu[2][3] = "Medu Wada";
        menu[2][4] = "Sada Dosa";
        menu[2][5] = "Masala Dosa";
        menu[2][6] = "Uttappam";
        menu[2][7] = "Onion Rawa Masala Dosa";
		
		menu[3][0] = "DosaSpecial Banjara Paneer Kebab";
        menu[3][1] = "Tandoori Paneer Tikka";
        menu[3][2] = "Pahadi Paneer Tikka";
        menu[3][3] = "Atishi Tandoori Aloo";
        menu[3][4] = "Veg.Seekh Kebab";
        menu[3][5] = "Kurkure Bhindi";
        menu[3][6] = "Tandoori Corn";
        menu[3][7] = "Paneer Malai Tikka";
		
		menu[4][0] = "Tandoori Paneer Tikka";
        menu[4][1] = "Pahadi Mushroom";
        menu[4][2] = "Vietnamese Grilled Veg";
        menu[4][3] = "Veg.Shammi Kebeb";
        menu[4][4] = "Cajun Spice Potato";
        menu[4][5] = "Crispy Corn";
        menu[4][6] = "Chatkari Fruit Skewer";
        menu[4][7] = "Angara Chicken Tikka";
		
		menu[5][0] = "Tomatto Soup";
        menu[5][1] = "Vegetable Soup";
        menu[5][2] = "Palak Cheese Soup";
        menu[5][3] = "Sweet Corn Soup";
        menu[5][4] = "Manchow Soup";
        menu[5][5] = "Wonton Soup";
        menu[5][6] = "French Onion Soup";
        menu[5][7] = "Lung Fung Soup";
		
		menu[6][0] = "Tangdi Kebab Full";
        menu[6][1] = "Tangdi Kebab Half";
        menu[6][2] = "Chicken Tandoori Full";
        menu[6][3] = "Chicken Tandoori Half";
        menu[6][4] = "Banjara Kebab";
        menu[6][5] = "Chicken Sheek Kebab";
        menu[6][6] = "Chicken Tikka";
        menu[6][7] = "Malai Kebab";
		
		menu[7][0] = "Paneer Butter Masala";
        menu[7][1] = "Paneer Tikka Masala";
        menu[7][2] = "Paneer Chips Masala";
        menu[7][3] = "Mutter Paneer";
        menu[7][4] = "Palak Paneer";
        menu[7][5] = "Shahi Paneer";
        menu[7][6] = "Paneer Kadai";
        menu[7][7] = "Paneer Bhurji";


        priceArray[0][0] = 299;
        priceArray[0][1] = 399;
        priceArray[0][2] = 275;
        priceArray[0][3] = 250;
        priceArray[0][4] = 300;
        priceArray[0][5] = 399;
        priceArray[0][5] = 450;
        priceArray[0][6] = 500;
        priceArray[0][7] = 299;

        priceArray[1][0] = 120;
        priceArray[1][1] = 110;
        priceArray[1][2] = 180;
        priceArray[1][3] = 220;
        priceArray[1][4] = 200;
        priceArray[1][5] = 399;
        priceArray[1][5] = 350;
        priceArray[1][6] = 400;
        priceArray[1][7] = 280;
		
		priceArray[2][0] = 660;
        priceArray[2][1] = 670;
        priceArray[2][2] = 600;
        priceArray[2][3] = 550;
        priceArray[2][4] = 600;
        priceArray[2][5] = 650;
        priceArray[2][5] = 660;
        priceArray[2][6] = 700;
        priceArray[2][7] = 825;
		
		priceArray[3][0] = 300;
        priceArray[3][1] = 280;
        priceArray[3][2] = 270;
        priceArray[3][3] = 230;
        priceArray[3][4] = 260;
        priceArray[3][5] = 230;
        priceArray[3][5] = 290;
        priceArray[3][6] = 240;
        priceArray[3][7] = 280;
		
		priceArray[4][0] = 590;
        priceArray[4][1] = 499;
        priceArray[4][2] = 375;
        priceArray[4][3] = 550;
        priceArray[4][4] = 700;
        priceArray[4][5] = 379;
        priceArray[4][5] = 450;
        priceArray[4][6] = 500;
        priceArray[4][7] = 380;
		
		priceArray[5][0] = 65;
        priceArray[5][1] = 60;
        priceArray[5][2] = 70;
        priceArray[5][3] = 80;
        priceArray[5][4] = 90;
        priceArray[5][5] = 60;
        priceArray[5][5] = 100;
        priceArray[5][6] = 70;
        priceArray[5][7] = 80;
		
		priceArray[6][0] = 300;
        priceArray[6][1] = 190;
        priceArray[6][2] = 300;
        priceArray[6][3] = 190;
        priceArray[6][4] = 290;
        priceArray[6][5] = 300;
        priceArray[6][5] = 290;
        priceArray[6][6] = 295;
        priceArray[6][7] = 320;
		
		priceArray[7][0] = 190;
        priceArray[7][1] = 180;
        priceArray[7][2] = 195;
        priceArray[7][3] = 190;
        priceArray[7][4] = 185;
        priceArray[7][5] = 190;
        priceArray[7][5] = 195;
        priceArray[7][6] = 200;
        priceArray[7][7] = 210;

		
        //  alert(menu[0][0]["price"]);
        //menu[0][1]["price"] = "399";
        //menu[0][2]["price"] = "75";
        //menu[0][3]["price"] = "250";
        //menu[0][4]["price"] = "300";
        //menu[0][5]["price"] = "399";
        //menu[0][6]["price"] = "450";
        //menu[0][7]["price"] = "500";
