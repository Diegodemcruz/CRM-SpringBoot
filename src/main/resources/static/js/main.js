/**
 * 
 */

$(document)
		.ready(
				function() {

					$('.table .eBtn').on('click', function(event) {

								event.preventDefault();
								var href = $(this).attr('href');

								$.get(href, function(produto, status) {
									console.log(produto);
									$('#produto_id').val(produto.produto_id);
									$('#produto_nome').val(produto.produto_nome);
									$('#produto_status').val(produto.produto_status);
									$("#nivelInstrucao").val(produto.nivelInstrucao);
									$('#produto_descricao').val(produto.produto_descricao);
									
								});

								$('#exampleModal').modal();

							});

					/*
					 * $.get( '/plot', function(result){ console.log(result);
					 * var month = result.month; var subscribers =
					 * result.subscribers;
					 * 
					 * Highcharts.chart('container', { chart: { type: 'line',
					 * width: 500 }, title: { text: "Line Chart" }, xAxis: {
					 * categories: month }, tooltip: { formatter: function(){
					 * console.log(this); return '<strong>' +this.x+':
					 * </strong>' +this.y; } },
					 * 
					 * series: [{ data: subscribers }]
					 * 
					 * });
					 * 
					 * });
					 */

					Highcharts.chart('container1', {
						chart : {
							type : 'line',
							width : 500
						},
						title : {
							text : "Line Chart"
						},
						xAxis : {
							categories : [ 'jan', 'fev', 'mar', 'abr' ]
						},
						tooltip : {
							formatter : function() {
								console.log(this);
								return '<strong>' + this.x + ': </strong>'
										+ this.y;
							}
						},

						series : [ {
							data : [ 10, 20, 30, 40, 50 ]
						} ]

					});

					Highcharts
							.chart(
									'container',
									{
										chart : {
											plotBackgroundColor : null,
											plotBorderWidth : 0,
											plotShadow : false
										},
										title : {
											text : 'Browser<br>shares<br>2017',
											align : 'center',
											verticalAlign : 'middle',
											y : 60
										},
										tooltip : {
											pointFormat : '{series.name}: <b>{point.percentage:.1f}%</b>'
										},
										plotOptions : {
											pie : {
												dataLabels : {
													enabled : true,
													distance : -50,
													style : {
														fontWeight : 'bold',
														color : 'white'
													}
												},
												startAngle : -90,
												endAngle : 90,
												center : [ '50%', '75%' ],
												size : '110%'
											}
										},
										series : [ {
											type : 'pie',
											name : 'Browser share',
											innerSize : '50%',
											data : [
													[ 'Chrome', 58.9 ],
													[ 'Firefox', 13.29 ],
													[ 'Internet Explorer', 13 ],
													[ 'Edge', 3.78 ],
													[ 'Safari', 3.42 ], {
														name : 'Other',
														y : 7.61,
														dataLabels : {
															enabled : false
														}
													} ]
										} ]
									});

					Highcharts.chart('container3',	{
										chart : {
											type : 'funnel3d',
											options3d : {
												enabled : true,
												alpha : 10,
												depth : 50,
												viewDistance : 50
											}
										},
										title : {
											text : 'Highcharts Funnel3D Chart'
										},
										plotOptions : {
											series : {
												dataLabels : {
													enabled : true,
													format : '<b>{point.name}</b> ({point.y:,.0f})',
													allowOverlap : true,
													y : 10
												},
												neckWidth : '40%',
												neckHeight : '25%',
												width : '50%',
												height : '60%'
											}
										},
										series : [ {
											name : 'Unique users',
											data : [
													[ 'Prospecção', 5654 ],
													[ 'Downloads', 4064 ],
													[ 'Requested price list',
															1987 ],
													[ 'Invoice sent', 976 ]
													 ]
										} ]
									});
					
					Highcharts.chart('container4', {
						  chart: {
						    type: 'cylinder',
						    options3d: {
						      enabled: true,
						      alpha: 15,
						      beta: 15,
						      depth: 50,
						      viewDistance: 25
						    }
						  },
						  title: {
						    text: 'Highcharts Cylinder Chart'
						  },
						  plotOptions: {
						    series: {
						      depth: 25,
						      colorByPoint: true
						    }
						  },
						  series: [{
						    data: [29.9, 71.5, 106.4, 129.2, 144.0],
						    name: 'Cylinders',
						    showInLegend: false
						  }]
						});

				});

// .nBtn,

/* var text = $(this).text(); */
/* if(text == 'Edit'){ */