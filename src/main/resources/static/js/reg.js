var i = 0;
$(document).ready(function() {

	console.log(i);
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
		console.log(i);
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


	$('.reg').on('submit',function(event) {

		event.preventDefault();
		var choice = $('.choice').val();
		window.alert(choice);
		var link = null;
		if (choice == "student") {
			link = "/sreg";
		} else {
			link = "/freg";
		}
		setTimeout(function() {
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
		}, 1000)



	});
});



