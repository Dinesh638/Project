var i = 0;
$(document).ready(function() {

	$('.reg').validate({ // initialize the plugin
		rules:
		{
			id: {
				number:true,
				required: true,
				minlength: 5,
				maxlength:10
			},
			enroll: {
				number:true,
				required: true,
				minlength: 5,
				maxlength:10
			},
			name: {
				required: true,
				minlength: 5
			},
			fname: {
				required: true,
				minlength: 5
			},
			mname: {
				required: true,
				minlength: 5
			},
			lname: {
				required: true,
				minlength: 5
			},
			email: {
				required: true,
				minlength: 5
			},
			password: {
				required: true,
				minlength: 5
			},
			contact: {
				number:true,
				required: true,
				minlength: 5,
				maxlength:10
			},
			acontact: {
				number:true,
				required: true,
				minlength: 5,
				maxlength:10
			}

		},
		submitHandler: function(form) {
			
			var choice = $('.choice').val();
//			window.alert(choice);
			var link = null;

			if (choice == "student") {
				link = "/ssave";

			} else {
				link = "/fsave";
			}

			
			$.ajax({
				type: "POST",
				url: link,
				data: $(form).serialize(),
				success: function(data) {
										
					window.alert("Successfully Registered");
				},
				error: function(data) {
					window.alert("Not Registered Successfully");
				}
			});
		}




	});


	
	if (i == 0) {
		$.ajax({
			type: "GET",
			url: "/sreg",
			success: function(data) {
				//remove disabled from province and change the options	

				$('.reg').html(data);
			},
			error: function(data) {
				console.log(data);
			}
		});
		i = i + 1;
		
	}

	$('.choice').on('change', function() {
		var choice = $(this).val();
		var link = null;
		if (choice == "student") {
			link = "/sreg";
		} else {
			link = "/freg";
		}
		$.ajax({
			type: "GET",
			url: link,
			success: function(data) {
				//remove disabled from province and change the options					
				$('.reg').html(data);
			},
			error: function(data) {
				console.log(data.response);
			}
		});
	});


	//	$('.reg').on('submit', function(event) {
	//
	//		event.preventDefault();
	//		var choice = $('.choice').val();
	//		window.alert(choice);
	//		var link = null;
	//		var obj = {};
	//		if (choice == "student") {
	//			link = "/sreg";
	//			var e = $('enroll').val();
	//			var f = $('fname').val();
	//			var m = $('mname').val();
	//			var l = $('lname').val();
	//
	//			var em = $('email').val();
	//			var p = $('password').val();
	//
	//			var c = $('contact').val();
	//			var ac = $('acontact').val();
	//
	//		} else {
	//			link = "/freg";
	//		}
	//
	//
	//
	//
	//
	//		setTimeout(function() {
	//				$.ajax({
	//					type: "GET",
	//					url: link,
	//					success: function(data) {
	//						//remove disabled from province and change the options					
	//						$('.reg').html(data);
	//					},
	//					error: function(data) {
	//						console.log(data.response);
	//					}
	//				});
	//		}, 1000)
	//
	//
	//
	//	});
});



