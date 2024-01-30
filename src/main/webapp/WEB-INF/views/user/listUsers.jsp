<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.1.1/flowbite.min.css"
	rel="stylesheet" />

<script src="https://cdn.tailwindcss.com"></script>
</head>
<body>





	<nav
		class="fixed top-0 z-50 w-full bg-white border-b border-teal-200 dark:bg-teal-950 dark:border-teal-700">
		<div class="px-3 py-3 lg:px-5 lg:pl-3">
			<div class="flex items-center justify-between">
				<div class="flex items-center justify-start rtl:justify-end">
					<button data-drawer-target="logo-sidebar"
						data-drawer-toggle="logo-sidebar" aria-controls="logo-sidebar"
						type="button"
						class="inline-flex items-center p-2 text-sm text-teal-500 rounded-lg sm:hidden hover:bg-teal-100 focus:outline-none focus:ring-2 focus:ring-teal-200 dark:text-teal-400 dark:hover:bg-teal-700 dark:focus:ring-teal-600">
						<span class="sr-only">Open sidebar</span>
						<svg class="w-6 h-6" aria-hidden="true" fill="currentColor"
							viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
               <path clip-rule="evenodd" fill-rule="evenodd"
								d="M2 4.75A.75.75 0 012.75 4h14.5a.75.75 0 010 1.5H2.75A.75.75 0 012 4.75zm0 10.5a.75.75 0 01.75-.75h7.5a.75.75 0 010 1.5h-7.5a.75.75 0 01-.75-.75zM2 10a.75.75 0 01.75-.75h14.5a.75.75 0 010 1.5H2.75A.75.75 0 012 10z"></path>
            </svg>
					</button>
					<a
						href="https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html"
						class="flex ms-2 md:me-24"> <span
						class="self-center text-xl font-semibold sm:text-2xl whitespace-nowrap dark:text-white">Spring
							MVC</span>
					</a>
				</div>
				<div class="flex items-center">
					<div class="flex items-center ms-3">
						<div>
							<button type="button"
								class="flex text-sm bg-teal-800 rounded-full focus:ring-4 focus:ring-teal-300 dark:focus:ring-teal-600"
								aria-expanded="false" data-dropdown-toggle="dropdown-user">
								<span class="sr-only">Open user menu</span> <img
									class="w-8 h-8 rounded-full"
									src="<c:url value="/resources/images/avatar.png" />"
									alt="user photo">
							</button>
						</div>
						<div
							class="z-50 hidden my-4 text-base list-none bg-white divide-y divide-teal-100 rounded shadow dark:bg-teal-700 dark:divide-teal-600"
							id="dropdown-user">
							<div class="px-4 py-3" role="none">
								<p class="text-sm text-teal-900 dark:text-white" role="none">
									Hello there,</p>
								<p
									class="text-sm font-medium text-teal-900 truncate dark:text-teal-300"
									role="none">Hehe</p>
							</div>
							<ul class="py-1" role="none">
								<li><a href="#"
									class="block px-4 py-2 text-sm text-teal-700 hover:bg-teal-100 dark:text-teal-300 dark:hover:bg-teal-600 dark:hover:text-white"
									role="menuitem">Dashboard</a></li>
								<li><a href="#"
									class="block px-4 py-2 text-sm text-teal-700 hover:bg-teal-100 dark:text-teal-300 dark:hover:bg-teal-600 dark:hover:text-white"
									role="menuitem">Settings</a></li>
								<li><a href="#"
									class="block px-4 py-2 text-sm text-teal-700 hover:bg-teal-100 dark:text-teal-300 dark:hover:bg-teal-600 dark:hover:text-white"
									role="menuitem">Sign out</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</nav>

	<aside id="logo-sidebar"
		class="fixed top-0 left-0 z-40 w-64 h-screen pt-20 transition-transform -translate-x-full bg-white border-r border-teal-200 sm:translate-x-0 dark:bg-teal-950 dark:border-teal-800"
		aria-label="Sidebar">
		<div
			class="h-full px-3 pb-4 overflow-y-auto bg-white dark:bg-teal-950">
			<ul class="space-y-2 font-medium">
				<li><a href="<c:url value="/"/>"
					class="flex items-center p-2 text-teal-900 rounded-lg dark:text-white hover:bg-teal-100 dark:hover:bg-teal-700 group">
						<svg
							class="w-5 h-5 text-teal-500 transition duration-75 dark:text-teal-400 group-hover:text-teal-900 dark:group-hover:text-white"
							aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
							fill="currentColor" viewBox="0 0 22 21">
                  <path
								d="M16.975 11H10V4.025a1 1 0 0 0-1.066-.998 8.5 8.5 0 1 0 9.039 9.039.999.999 0 0 0-1-1.066h.002Z" />
                  <path
								d="M12.5 0c-.157 0-.311.01-.565.027A1 1 0 0 0 11 1.02V10h8.975a1 1 0 0 0 1-.935c.013-.188.028-.374.028-.565A8.51 8.51 0 0 0 12.5 0Z" />
               </svg> <span class="ms-3">Dashboard</span>
				</a></li>
				<li><a href="<c:url value="/users"/>"
					class="flex items-center p-2 text-teal-900 rounded-lg dark:text-white hover:bg-teal-100 dark:hover:bg-teal-700 group">
						<svg
							class="flex-shrink-0 w-5 h-5 text-teal-500 transition duration-75 dark:text-teal-400 group-hover:text-teal-900 dark:group-hover:text-white"
							aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
							fill="currentColor" viewBox="0 0 18 18">
                  <path
								d="M6.143 0H1.857A1.857 1.857 0 0 0 0 1.857v4.286C0 7.169.831 8 1.857 8h4.286A1.857 1.857 0 0 0 8 6.143V1.857A1.857 1.857 0 0 0 6.143 0Zm10 0h-4.286A1.857 1.857 0 0 0 10 1.857v4.286C10 7.169 10.831 8 11.857 8h4.286A1.857 1.857 0 0 0 18 6.143V1.857A1.857 1.857 0 0 0 16.143 0Zm-10 10H1.857A1.857 1.857 0 0 0 0 11.857v4.286C0 17.169.831 18 1.857 18h4.286A1.857 1.857 0 0 0 8 16.143v-4.286A1.857 1.857 0 0 0 6.143 10Zm10 0h-4.286A1.857 1.857 0 0 0 10 11.857v4.286c0 1.026.831 1.857 1.857 1.857h4.286A1.857 1.857 0 0 0 18 16.143v-4.286A1.857 1.857 0 0 0 16.143 10Z" />
               </svg> <span class="flex-1 ms-3 whitespace-nowrap">Users</span>
						<span
						class="inline-flex items-center justify-center px-2 ms-3 text-sm font-medium text-teal-800 bg-teal-100 rounded-full dark:bg-teal-700 dark:text-teal-300">Pro</span>
				</a></li>
				<li><a href="<c:url value="/employees"/>"
					class="flex items-center p-2 text-teal-900 rounded-lg dark:text-white hover:bg-teal-100 dark:hover:bg-teal-700 group">
						<svg
							class="flex-shrink-0 w-5 h-5 text-teal-500 transition duration-75 dark:text-teal-400 group-hover:text-teal-900 dark:group-hover:text-white"
							aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
							fill="currentColor" viewBox="0 0 20 20">
                  <path
								d="m17.418 3.623-.018-.008a6.713 6.713 0 0 0-2.4-.569V2h1a1 1 0 1 0 0-2h-2a1 1 0 0 0-1 1v2H9.89A6.977 6.977 0 0 1 12 8v5h-2V8A5 5 0 1 0 0 8v6a1 1 0 0 0 1 1h8v4a1 1 0 0 0 1 1h2a1 1 0 0 0 1-1v-4h6a1 1 0 0 0 1-1V8a5 5 0 0 0-2.582-4.377ZM6 12H4a1 1 0 0 1 0-2h2a1 1 0 0 1 0 2Z" />
               </svg> <span class="flex-1 ms-3 whitespace-nowrap">Employees</span>
				</a></li>
				<li><a href="<c:url value="/departments"/>"
					class="flex items-center p-2 text-teal-900 rounded-lg dark:text-white hover:bg-teal-100 dark:hover:bg-teal-700 group">
						<svg
							class="flex-shrink-0 w-5 h-5 text-teal-500 transition duration-75 dark:text-teal-400 group-hover:text-teal-900 dark:group-hover:text-white"
							aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
							fill="currentColor" viewBox="0 0 20 18">
                  <path
								d="M14 2a3.963 3.963 0 0 0-1.4.267 6.439 6.439 0 0 1-1.331 6.638A4 4 0 1 0 14 2Zm1 9h-1.264A6.957 6.957 0 0 1 15 15v2a2.97 2.97 0 0 1-.184 1H19a1 1 0 0 0 1-1v-1a5.006 5.006 0 0 0-5-5ZM6.5 9a4.5 4.5 0 1 0 0-9 4.5 4.5 0 0 0 0 9ZM8 10H5a5.006 5.006 0 0 0-5 5v2a1 1 0 0 0 1 1h11a1 1 0 0 0 1-1v-2a5.006 5.006 0 0 0-5-5Z" />
               </svg> <span class="flex-1 ms-3 whitespace-nowrap">Departments</span>
						<span
						class="inline-flex items-center justify-center w-3 h-3 p-3 ms-3 text-sm font-medium text-blue-800 bg-blue-100 rounded-full dark:bg-teal-700 dark:text-teal-300">3</span>
				</a></li>

			</ul>


			<div id="dropdown-cta"
				class="p-4 mt-6 rounded-lg bg-blue-50 dark:bg-teal-700" role="alert">
				<div class="flex items-center mb-3">
					<span
						class="bg-orange-300 text-orange-800 text-sm font-semibold me-2 px-2.5 py-0.5 rounded dark:bg-orange-200 dark:text-orange-900">Beta</span>
					<button type="button"
						class="ms-auto -mx-1.5 -my-1.5 bg-blue-50 inline-flex justify-center items-center w-6 h-6 text-orange-900 rounded-lg focus:ring-2 focus:ring-blue-400 p-1 hover:bg-blue-200 h-6 w-6 dark:bg-orange-300 dark:text-orange-900 dark:hover:bg-orange-900"
						data-dismiss-target="#dropdown-cta" aria-label="Close">
						<span class="sr-only">Close</span>
						<svg class="w-2.5 h-2.5" aria-hidden="true"
							xmlns="http://www.w3.org/2000/svg" fill="none"
							viewBox="0 0 14 14">
                  <path stroke="currentColor" stroke-linecap="round"
								stroke-linejoin="round" stroke-width="2"
								d="m1 1 6 6m0 0 6 6M7 7l6-6M7 7l-6 6" />
               </svg>
					</button>
				</div>
				<p class="mb-3 text-sm text-orange-300">Please note that we are
					currently in beta, fine-tuning our features for an optimal
					experience. Your feedback is invaluable as we work towards
					perfection. Join us on this journey, and let's shape the future of
					HR together.</p>
			</div>



			<ul
				class="pt-4 mt-4 space-y-2 font-medium border-t border-teal-200 dark:border-teal-700">
				<li><a href="#"
					class="flex items-center p-2 text-teal-900 transition duration-75 rounded-lg hover:bg-teal-100 dark:hover:bg-teal-700 dark:text-white group">
						<svg
							class="flex-shrink-0 w-5 h-5 text-teal-500 transition duration-75 dark:text-teal-400 group-hover:text-teal-900 dark:group-hover:text-white"
							aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
							fill="currentColor" viewBox="0 0 17 20">
                  <path
								d="M7.958 19.393a7.7 7.7 0 0 1-6.715-3.439c-2.868-4.832 0-9.376.944-10.654l.091-.122a3.286 3.286 0 0 0 .765-3.288A1 1 0 0 1 4.6.8c.133.1.313.212.525.347A10.451 10.451 0 0 1 10.6 9.3c.5-1.06.772-2.213.8-3.385a1 1 0 0 1 1.592-.758c1.636 1.205 4.638 6.081 2.019 10.441a8.177 8.177 0 0 1-7.053 3.795Z" />
               </svg> <span class="ms-3">Upgrade to Pro (beta)</span>
				</a></li>
				<li><a href="#"
					class="flex items-center p-2 text-teal-900 transition duration-75 rounded-lg hover:bg-teal-100 dark:hover:bg-teal-700 dark:text-white group">
						<svg
							class="flex-shrink-0 w-5 h-5 text-teal-500 transition duration-75 dark:text-teal-400 group-hover:text-teal-900 dark:group-hover:text-white"
							aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
							fill="currentColor" viewBox="0 0 16 20">
                  <path
								d="M16 14V2a2 2 0 0 0-2-2H2a2 2 0 0 0-2 2v15a3 3 0 0 0 3 3h12a1 1 0 0 0 0-2h-1v-2a2 2 0 0 0 2-2ZM4 2h2v12H4V2Zm8 16H3a1 1 0 0 1 0-2h9v2Z" />
               </svg> <span class="ms-3">Documentation</span>
				</a></li>
				<li><a href="#"
					class="flex items-center p-2 text-teal-900 transition duration-75 rounded-lg hover:bg-teal-100 dark:hover:bg-teal-700 dark:text-white group">
						<svg
							class="flex-shrink-0 w-5 h-5 text-teal-500 transition duration-75 dark:text-teal-400 group-hover:text-teal-900 dark:group-hover:text-white"
							aria-hidden="true" xmlns="http://www.w3.org/2000/svg"
							fill="currentColor" viewBox="0 0 21 21">
                  <path
								d="m5.4 2.736 3.429 3.429A5.046 5.046 0 0 1 10.134 6c.356.01.71.06 1.056.147l3.41-3.412c.136-.133.287-.248.45-.344A9.889 9.889 0 0 0 10.269 1c-1.87-.041-3.713.44-5.322 1.392a2.3 2.3 0 0 1 .454.344Zm11.45 1.54-.126-.127a.5.5 0 0 0-.706 0l-2.932 2.932c.029.023.049.054.078.077.236.194.454.41.65.645.034.038.078.067.11.107l2.927-2.927a.5.5 0 0 0 0-.707Zm-2.931 9.81c-.024.03-.057.052-.081.082a4.963 4.963 0 0 1-.633.639c-.041.036-.072.083-.115.117l2.927 2.927a.5.5 0 0 0 .707 0l.127-.127a.5.5 0 0 0 0-.707l-2.932-2.931Zm-1.442-4.763a3.036 3.036 0 0 0-1.383-1.1l-.012-.007a2.955 2.955 0 0 0-1-.213H10a2.964 2.964 0 0 0-2.122.893c-.285.29-.509.634-.657 1.013l-.01.016a2.96 2.96 0 0 0-.21 1 2.99 2.99 0 0 0 .489 1.716c.009.014.022.026.032.04a3.04 3.04 0 0 0 1.384 1.1l.012.007c.318.129.657.2 1 .213.392.015.784-.05 1.15-.192.012-.005.02-.013.033-.018a3.011 3.011 0 0 0 1.676-1.7v-.007a2.89 2.89 0 0 0 0-2.207 2.868 2.868 0 0 0-.27-.515c-.007-.012-.02-.025-.03-.039Zm6.137-3.373a2.53 2.53 0 0 1-.35.447L14.84 9.823c.112.428.166.869.16 1.311-.01.356-.06.709-.147 1.054l3.413 3.412c.132.134.249.283.347.444A9.88 9.88 0 0 0 20 11.269a9.912 9.912 0 0 0-1.386-5.319ZM14.6 19.264l-3.421-3.421c-.385.1-.781.152-1.18.157h-.134c-.356-.01-.71-.06-1.056-.147l-3.41 3.412a2.503 2.503 0 0 1-.443.347A9.884 9.884 0 0 0 9.732 21H10a9.9 9.9 0 0 0 5.044-1.388 2.519 2.519 0 0 1-.444-.348ZM1.735 15.6l3.426-3.426a4.608 4.608 0 0 1-.013-2.367L1.735 6.4a2.507 2.507 0 0 1-.35-.447 9.889 9.889 0 0 0 0 10.1c.1-.164.217-.316.35-.453Zm5.101-.758a4.957 4.957 0 0 1-.651-.645c-.033-.038-.077-.067-.11-.107L3.15 17.017a.5.5 0 0 0 0 .707l.127.127a.5.5 0 0 0 .706 0l2.932-2.933c-.03-.018-.05-.053-.078-.076ZM6.08 7.914c.03-.037.07-.063.1-.1.183-.22.384-.423.6-.609.047-.04.082-.092.129-.13L3.983 4.149a.5.5 0 0 0-.707 0l-.127.127a.5.5 0 0 0 0 .707L6.08 7.914Z" />
               </svg> <span class="ms-3">Help</span>
				</a></li>
			</ul>
		</div>
	</aside>

	<div class="p-4 sm:ml-64">
		<div
			class="p-4 border-2 border-teal-200 border-dashed rounded-lg dark:border-teal-700 mt-14">




			<section class="bg-white ">
				<div class="pt-8 px-4 mx-auto max-w-screen-xl text-center lg:pt-16">
					<h1
						class="mb-4 text-4xl font-extrabold tracking-tight leading-none text-teal-900 md:text-5xl lg:text-6xl">We
						invest in the world's potential</h1>
					<p
						class="mb-8 text-lg font-normal text-teal-900 lg:text-xl sm:px-16 lg:px-48">Here
						we focus on markets where technology, innovation, and capital can
						unlock long-term value and drive economic growth.</p>
				</div>
			</section>




			<div class="relative overflow-x-auto shadow-md sm:rounded-lg ">
				<h1 class="text-2xl text-teal-900 mb-5">
					<b>List of Users</b>
				</h1>
				<table class="w-full text-sm text-white">
					<thead
						class="text-xs text-white uppercase bg-teal-50 dark:bg-teal-700 dark:text-white md:hover:text-orange-600">
						<tr>
							<th scope="col" class="px-6 py-3">User ID</th>
							<th scope="col" class="px-6 py-3">Username</th>
							<th scope="col" class="px-6 py-3">Passwords</th>
							<th scope="col" class="px-6 py-3">Role</th>
							<th scope="col" class="px-6 py-3"></th>
							<th scope="col" class="px-6 py-3">Actions</th>
							<th scope="col" class="px-6 py-3"></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="user" items="${users}">
							<tr
								class="bg-white border-b text-center dark:bg-teal-800 dark:border-teal-700 md:hover:text-orange-300">
								<th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">
									<c:out value="${user.id}" />
								</th>
								<td class="px-6 py-4"><c:out value="${user.username}" /></td>
								<td class="px-6 py-4"><c:out value="${user.password}" /></td>
								<td class="px-6 py-4"><c:out value="${user.role}" /></td>
								<td class="px-6 py-4 md:hover:text-white"><a
									href="<c:url value="/users/${user.id}"/>">Details</a></td>
								<td class="px-6 py-4 md:hover:text-white"><a
									href="<c:url value="/users/edit/${user.id}"/>">Edit</a></td>
								<td class="px-6 py-4 md:hover:text-white"><a
									href="<c:url value="/users/delete/${user.id}"/>">Delete</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>


			<a class="pointer" href="<c:url value="/users/add"/>">
				<button
					class="relative inline-flex items-center justify-center p-0.5 mb-2 me-2 my-2 overflow-hidden text-sm font-medium text-gray-900 rounded-lg group bg-gradient-to-br from-green-400 to-blue-600 group-hover:from-green-400 group-hover:to-blue-600 hover:text-white dark:text-white focus:ring-4 focus:outline-none focus:ring-green-200 dark:focus:ring-green-800">
					<span
						class="relative px-5 py-2.5 transition-all ease-in duration-75 bg-white dark:bg-gray-900 rounded-md group-hover:bg-opacity-0">
						CREATE A USER </span>
				</button>
			</a>

		</div>
	</div>
	</div>

	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.1.1/flowbite.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/tw-elements/dist/js/tw-elements.umd.min.js"></script>

</body>
</html>