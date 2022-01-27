<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<!--Font awesome icons -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"
	integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/static/css/style.css">
<title>Home Page</title>
<link id="chromealerabat-link" rel="stylesheet" type="text/css"
	href="chrome-extension://dacdinoicboceafielngnmjjplncljhj/content.css">
</head>
<body
	style="background-position: center center; background-repeat: no-repeat; background-attachment: fixed; background-size: cover; background-color: honeydew;"
	data-new-gr-c-s-check-loaded="14.1045.0" data-gr-ext-installed="">
	<div id="StayFocusd-infobar" style="display: none;">
		<img
			src="chrome-extension://laankejkbhbdhmipfmgcngdelahlfoji/common/img/eye_19x19_red.png">
		<span id="StayFocusd-infobar-msg"></span> <span
			id="StayFocusd-infobar-links"> <a
			id="StayFocusd-infobar-never-show">hide forever</a>&nbsp;&nbsp;|&nbsp;&nbsp;
			<a id="StayFocusd-infobar-hide">hide once</a>
		</span>
	</div>
	<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
		<a class="navbar-brand mt-2 mt-lg-0" href="/"> <img
			src="/static/images/up_bar.jpg" height="35" alt="" loading="lazy">
		</a>
		<button type="button" class="navbar-toggler" data-toggle="collapse"
			data-target="#navbarCollapse">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarCollapse">
			<div class="navbar-nav ml-auto">
				<p id="hello-msg" class="nav-item nav-link">Hello, user01
					&nbsp;&nbsp;&nbsp;</p>
			</div>
			<div class="navbar-nav ml-auto">
				<a href="profile.jsp" class="nav-item nav-link"><i
					class="far fa-address-card"></i>&nbsp;&nbsp;Profile</a> <a
					href="index.jsp" class="nav-item nav-link"> <i
					class="fas fa-sign-out-alt"></i>&nbsp;&nbsp;Logout
				</a>
			</div>
		</div>
	</nav>
	<br>
	<br>
	<div class="container">
		<style>
.my-custom-scrollbar {
	position: relative;
	height: 300px;
	overflow: auto;
}

.table-wrapper-scroll-y {
	display: block;
}
</style>
		<div class="item1"
			style="background-position: center center; background-repeat: no-repeat; background-attachment: fixed; background-size: cover; background-color: honeydew;">
			<br>
			<section>
				<div class="col">
					<h2 class="text-center" style="color: #232588">Logs</h2>

					<div class="table-wrapper-scroll-y my-custom-scrollbar">
						<table class="table table-hover table-striped mb-1 table-bordered"
							style="background-color: rgba(255, 255, 255, 0.8); align-content: center">
							<thead>
								<tr>
									<th scope="col">#</th>
									<th scope="col">Place</th>
									<th scope="col">Date, MM/dd/yyyy</th>
									<th scope="col">Time, HH:mm:ss</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<th scope="row">1</th>
									<td>ul.Kozanowska 46</td>
									<td>16/11/2021</td>
									<td>21:23:24</td>

								</tr>
								<tr>
									<th scope="row">2</th>
									<td>ul.Lukasinskiego 20</td>
									<td>15/11/2021</td>
									<td>09:24:00</td>

								</tr>
							</tbody>
						</table>
					</div>
					<style>
.center {
	margin: 0;
	position: absolute;
	top: 75%;
	left: 50%;
	-ms-transform: translate(-50%, -50%);
	transform: translate(-50%, -50%);
}
</style>
					<div class="center">
						<button>Search</button>
						<button>Find All</button>
						<button>Export</button>
					</div>
				</div>
			</section>


			<nav
				class="navbar navbar-expand-lg navbar-light bg-light fixed-bottom py-6 ">
				<div class="container-fluid">
					<ul class="navbar-nav mx-auto text-center nav-justified">
						<form action="dashboard.jsp">
							<li class="nav-item"><a class="nav-link"
								href="dashboard.jsp"><i class="fas fa-dashboard"></i>Dashboard</a>
							</li>
						</form>
						<form action="home.jsp">
							<li class="nav-item"><a class="nav-link" href="home.jsp"><i
									class="fas fa-home"></i>Home</a></li>
						</form>
						<form action="logs.jsp">
							<li class="nav-item"><a class="nav-link" href="logs.jsp"><i
									class="fas fa-info"></i>Logs</a></li>
						</form>
						<form action="devices.jsp">
							<li class="nav-item"><a class="nav-link" href="devices.jsp"><i
									class="fas fa-profile"></i>Device</a></li>
						</form>
						<form action="security.jsp">
							<li class="nav-item"><a class="nav-link" href="security.jsp"><i
									class="fas fa-unlock-alt"></i>Security</a></li>
						</form>
						<form action="setting.jsp">
							<li class="nav-item"><a class="nav-link" href="setting.jsp"><i
									class="fas fa-book"></i>Setting</a></li>
					</ul>
				</div>
			</nav>
			<!-- Optional JavaScript -->
			<!-- jQuery first, then Popper.js, then Bootstrap JS -->
			<!-- jQuery first, then Popper.js, then Bootstrap JS -->
			<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
				integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
				crossorigin="anonymous"></script>
			<script
				src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
				integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
				crossorigin="anonymous"></script>
			<script
				src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
				integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
				crossorigin="anonymous"></script>
			<!-- A plugin for password show/hide  -->
			<script
				src="https://unpkg.com/bootstrap-show-password@1.2.1/dist/bootstrap-show-password.min.js"></script>
			<br> <br>
			<br>
			<br>
</body>
<grammarly-desktop-integration data-grammarly-shadow-root="true"></grammarly-desktop-integration>
</html>