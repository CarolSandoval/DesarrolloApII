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
					
					<li><a href="new-scooter">Manage Scooter</a></li>
					<li><a href="all-scooters">All scooter</a></li>

				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME_SCOOTER'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Task Manager</h1>
				</div>
			</div>
		</c:when>





<c:when
			test="${mode=='MODE_NEW' || mode=='MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manager Scooter</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-scooter">
					<input type="hidden" name="id" value="${scooter.id}" />
					<div class="form-group">
						<label class="control-label col-md-3">Marca</label>
						<div class="col-md-7">
							<input type="text" class="form-control" value="${scooter.marca}"
								name="marca" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Modelo</label>
						<div class="col-md-7">
							<input type="text" class="form-control" value="${scooter.modelo}"
								name="modelo" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3">Exists</label>
						<div class="col-md-7">
							<input type="radio" class="col-sm-1" name="exists" value="true" />
							<div class="col-sm-1">Yes</div>
							<input type="radio" class="col-sm-1" name="exists" value="false"
								checked="checked" />
							<div class="col-sm-1">No</div>
						</div>
					</div>

					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save">
					</div>

				</form>
			</div>
		</c:when>
	<c:when test="${mode=='MODE_SCOOTERS' }">
			<div class="container text-center" id="scootersDiv">
				<h3>My Scooters</h3>
				<hr />
				<div class="table-reposive">
					<table class="table table-stiped table-bordered">
						<thead>
							<tr>
								<td>Id</td>
								<td>Marca</td>
								<td>Modelo</td>
								<td>Date created</td>
								<td>Exists</td>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="scooter" items="${scooters}">
								<tr>
									<td>${scooter.id}</td>
									<td>${scooter.marca}</td>
									<td>${scooter.modelo}</td>
									<td><fmt:formatDate pattern="dd-mm-yyyy"
											value="${scooter.dateCreated}" /></td>
									<td>${scooter.exists==true?'YES':'NO'}</td>
									<td><a href="update-scooters?id=${scooter.id}"> <span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-scooter?id=${scooter.id}"> <span
											class="glyphicon glyphicon-trash"></span>
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>




	</c:choose>

	<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="/static/js/bootstrap.min.js"></script>

</body>
</html>
