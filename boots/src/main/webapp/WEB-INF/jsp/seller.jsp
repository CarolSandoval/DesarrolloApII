<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap sample| Home</title>
<link href="/static/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="/static/css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Home</a>
			<div class="nav navbar-nav">
				<ul class="nav navbar-nav">
					
					<li><a href="new-seller">Manage Seller</a></li>
					<li><a href="all-sellers">All sellers</a></li>
				

				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME_SELLER'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Seller Manager</h1>
				</div>
			</div>
		</c:when>

		



















		<c:when test="${mode=='MODE_SELLERS' }">
			<div class="container text-center" id="sellersDiv">
				<h3>My Sellers</h3>
				<hr />
				<div class="table-reposive">
					<table class="table table-stiped table-bordered">
						<thead>
							<tr>
								<td>Id</td>
								<td>Name</td>
								<td>Lastname</td>
								<td>Telephone</td>
								<td>address</td>
								<td>Turn</td>
								<td>Email</td>
								<td>Age</td>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="seller" items="${sellers}">
								<tr>
									<td>${seller.id}</td>
									<td>${seller.name}</td>
									<td>${seller.lastName}</td>
									<td>${seller.telephone}</td>
									<td>${seller.address}</td>
									<td>${seller.email}</td>
									<td>${seller.age}</td>

									<td>${seller.turn==true?'MAT':'VESP'}</td>
									<td><a href="update-seller?id=${seller.id}"> <span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-seller?id=${seller.id}"> <span
											class="glyphicon glyphicon-trash"></span>
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when
			test="${mode=='MODE_NEW' || mode=='MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manager Seller</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-sellers">
					<input type="hidden" name="id" value="${seller.id}" />
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" value="${seller.name}"
								name="name" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">LastName</label>
						<div class="col-md-7">
							<input type="text" class="form-control"
								value="${seller.lastName}" name="lastName" />
						</div>
					</div>


					<div class="form-group">
						<label class="control-label col-md-3">Telephone</label>
						<div class="col-md-7">
							<input type="text" class="form-control"
								value="${seller.telephone}" name="telephone" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Address</label>
						<div class="col-md-7">
							<input type="text" class="form-control" value="${seller.address}"
								name="address" />
						</div>
					</div>






					<div class="form-group">
						<label class="control-label col-md-3">Email</label>
						<div class="col-md-7">
							<input type="text" class="form-control" value="${seller.email}"
								name="email" />
						</div>
					</div>


					<div class="form-group">
						<label class="control-label col-md-3">Age</label>
						<div class="col-md-7">
							<input type="text" class="form-control" value="${seller.age}"
								name="age" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Turn</label>
						<div class="col-md-7">
							<input type="radio" class="col-sm-1" name="turn" value="mat" />
							<div class="col-sm-1">Mat</div>
							<input type="radio" class="col-sm-1" name="turn" value="vesp"
								checked="checked" />
							<div class="col-sm-1">Vesp</div>
						</div>
					</div>


					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save">
					</div>

				</form>
			</div>
		</c:when>

	</c:choose>

	<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="/static/js/bootstrap.min.js"></script>

</body>
</html>
		