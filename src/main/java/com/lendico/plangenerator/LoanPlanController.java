package com.lendico.plangenerator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lendico.plangenerator.doa.LoanPayment;
import com.lendico.plangenerator.doa.PlanGenerator;

@RestController
public class LoanPlanController {

	@RequestMapping(value = "/api/generate-plan", method = RequestMethod.POST)
	public ArrayList<LoanPayment> generatePlan(@RequestBody Map<String, Object> payload) throws BadRequestException {

		Double loanAmount = Double.valueOf((String) payload.get("loanAmount"));
		Double nominalRate = Double.valueOf((String) payload.get("nominalRate"));
		Integer duration = (Integer) payload.get("duration");
		String startDate = (String) payload.get("startDate");

		if (loanAmount == null)
			throw new BadRequestException("loanAmount is not present in payload.");
		if (nominalRate == null)
			throw new BadRequestException("nominalRate is not present in payload.");
		if (duration == null)
			throw new BadRequestException("duration is not present in payload.");
		if (startDate == null)
			throw new BadRequestException("startDate is not present in payload.");

		Date date = null;
		try {
			date = PlanGenerator.dateFormatter.parse(startDate);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new BadRequestException("startDate is not in correct format.");
		}

		PlanGenerator planGenerator = new PlanGenerator(loanAmount, nominalRate, duration, date);
		
		return planGenerator.getPlan();
	}
}
