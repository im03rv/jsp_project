<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Profile</title>
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap"
	rel="stylesheet">
<!-- Bootstrap CSS -->
<link rel='stylesheet'
	href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css'>
<!-- Font Awesome CSS -->
<link rel='stylesheet'
	href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css'>
<style>
.navbar {
	padding: 5rem;
	text-align: center;
	/* display: flex;
	flex-direction: column;
	align:center; */
	/* display:grid; */
	justify-align:center;
	padding: 5rem;
    /* text-align: center; */
    display: grid;
    justify-align: center;
    /* align-content: space-evenly; */
    align-items: baseline;
    justify-content: center;
	
}
body {
	background: #67B26F; /* fallback for old browsers */
	background: -webkit-linear-gradient(to right, #4ca2cd, #67B26F);
	/* Chrome 10-25, Safari 5.1-6 */
	background: linear-gradient(to right, #4ca2cd, #67B26F);
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
	padding: 0;
	margin: 0;
	font-family: 'Lato', sans-serif;
	color: #000;
}

.student-profile .card {
	border-radius: 10px;
}

.student-profile .card .card-header .profile_img {
	width: 150px;
	height: 150px;
	object-fit: cover;
	margin: 10px auto;
	border: 10px solid #ccc;
	border-radius: 50%;
}

.student-profile .card h3 {
	font-size: 20px;
	font-weight: 700;
}

.student-profile .card p {
	font-size: 16px;
	color: #000;
}

.student-profile .table th, .student-profile .table td {
	font-size: 14px;
	padding: 5px 10px;
	color: #000;
}
</style>
</head>
<body>
	
		<%-- <nav class="navbar" >
			<div>
				<img src="${pageContext.request.contextPath}/resources/images/logo.png"
					alt="Profile Photo" class="logo-photo">
			</div>
			<div>
				<h1>${s.collegeName}</h1>
				<h4>${s.collegeQuote}</h4>
			</div>
		</nav>
 	--%>
 	<nav class ="navbar">
		<div class="container">
			<div class="row">
				<div class="col-sm"><img src="${pageContext.request.contextPath}/resources/images/logo.png"
					alt="Profile Photo" class="logo-photo"></div>
				<div class="col-sm"><h1>${s.collegeName}</h1>
				<h4>${s.collegeQuote}</h4></div>
				 
			</div>
		</div>
	</nav>
	<div class="student-profile py-4">
		<div class="container">
			<div class="row">
				<div class="col-lg-4">
					<div class="card shadow-sm">
						<div class="card-header bg-transparent text-center">
							<img class="profile_img"
								src="${pageContext.request.contextPath}/resources/images/profile.jpg"
								alt="student dp">
							<h3>${s.collegeName}</h3>
						</div>
						<div class="card-body">
							<p class="mb-0">
								<strong class="pr-1">Student ID:</strong>${s.id}
							</p>
							<p class="mb-0">
								<strong class="pr-1">Class:</strong>${s.className}
							</p>
							<p class="mb-0">
								<strong class="pr-1">Section:</strong>${s.section}
							</p>
						</div>
					</div>
				</div>

				<div class="col-lg-8">
					<div class="card shadow-sm">
						<div class="card-header bg-transparent border-0">
							<h3 class="mb-0">
								<i class="far fa-clone pr-1"></i>${s.about}
							</h3>
						</div>
						<div class="card-body pt-0">
							<p>School is the place where we learn to read and write and
								make friends. It is the most crucial place for a student, and it
								helps us to learn new things. The teachers are always helpful
								and teach us important things in life. We must always be regular
								to school as missing classes can lead to problems during exams.
								Schools teach us how to be consistent, punctual, and obedient.
						</div>
					</div>
					<div style="height: 26px"></div>
					<div class="card shadow-sm">
						<div class="card-header bg-transparent border-0">
							<h3 class="mb-0">
								<i class="far fa-clone pr-1"></i>General Information
							</h3>
						</div>
						<div class="card-body pt-0">
							<table class="table table-bordered">
								<tr>
									<th width="30%">Roll</th>
									<td width="2%">:</td>
									<td>${s.rollNo}</td>
								</tr>
								<tr>
									<th width="30%">Academic Year</th>
									<td width="2%">:</td>
									<td>2023</td>
								</tr>
								<tr>
									<th width="30%">Gender</th>
									<td width="2%">:</td>
									<td>${s.gender}</td>
								</tr>
								<tr>
									<th width="30%">Religion</th>
									<td width="2%">:</td>
									<td>${s.religion}</td>
								</tr>
								<tr>
									<th width="30%">Blood</th>
									<td width="2%">:</td>
									<td>${s.blood}</td>
								</tr>
								<tr>
									<th width="30%">Parent Name</th>
									<td width="2%">:</td>
									<td>${s.parentName}</td>
								</tr>
								<tr>
									<th width="30%">Parent Phone No.</th>
									<td width="2%">:</td>
									<td>${s.parentPhoneNumber}</td>
								</tr>
								<tr>
									<th width="30%">Address</th>
									<td width="2%">:</td>
									<td>${s.address}</td>
								</tr>
							</table>
						</div>
					</div>
					<div style="height: 26px"></div>
					<div class="col-lg-8">
						<div class="card shadow-sm">
							<div class="card-header bg-transparent border-0">
								<h3 class="mb-0">
									<i class="far fa-clone pr-1"></i>Additional Information
								</h3>
							</div>
							<div class="card-body pt-0">

								<table class="table table-bordered">
									<tr>
										<th width="30%">Hobbies:</th>
										<td width="2%">:</td>

										<c:forEach var="hobby" items="${s.hobbies}">
											<td>hobby</td>
										</c:forEach>
									</tr>
									<tr>
										<th width="30%">Favorite Foods:</th>
										<td width="2%">:</td>

										<c:forEach var="food" items="${s.foods}">
											<td>food</td>
										</c:forEach>
									</tr>
									<tr>
										<th width="30%">Sports:</th>
										<td width="2%">:</td>
										<c:forEach var="sport" items="${s.sports}">
											<td>sport</td>
										</c:forEach>
									</tr>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
