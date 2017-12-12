package com.enrol

class BootStrap {

    def init = { servletContext ->
	def computing = new Course (
	department:'Computing',
	code:'CS123',
	title:'BSc Hon Computing',
	leader:'Dr Michelle Murphy',
	startDate: new Date('09/09/2018'),
	endDate: new Date('07/07/2022'),
	numberOfStudents:55,
	studyMode:'Fulltime',
	tuitionFees:9000.60,
	description:'Lorem Ipsum dolor sit amet, cum sale error tants ne. Te duo putant detracto. In duo sonet urbanitas, ad vim vide tacimates.'
	).save()

    }
    def destroy = {
    }
}
