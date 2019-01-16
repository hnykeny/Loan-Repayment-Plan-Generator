package com.lendico.plangenerator.doa;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class PlanGenerator implements Serializable {

	private static final long serialVersionUID = -1402720846672727291L;

	private Double loanAmount;
	private Double interestRate;
	private Integer durationInMonths; // Months
	private Calendar startDate;
	private ArrayList<LoanPayment> paymentSchedule = null;

	private static final DecimalFormat decimalFormatter = new DecimalFormat("#.##");
	public static final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

	private PlanGenerator() {
	}

	public PlanGenerator(Double loanAmount, Double interestRate, Integer durationInMonths, Date startDate) {
		super();
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.durationInMonths = durationInMonths;
		this.startDate = Calendar.getInstance();
		this.startDate.setTime(startDate);
		this.paymentSchedule = new ArrayList<LoanPayment>(durationInMonths);

		Double interestRatePerMonth = this.interestRate / (12 * 100);

		Double annunity = (this.loanAmount * interestRatePerMonth
				* Math.pow(1 + interestRatePerMonth, durationInMonths))
				/ (Math.pow(1 + interestRatePerMonth, durationInMonths) - 1);
		annunity = Double.valueOf(PlanGenerator.decimalFormatter.format(annunity));

		double outstandingPrincipal = Double.valueOf(PlanGenerator.decimalFormatter.format(loanAmount));

		double interestAmount = (this.interestRate * 30 / 360) * outstandingPrincipal / 100;
		interestAmount = Double.valueOf(PlanGenerator.decimalFormatter.format(interestAmount));

		double principalAmount = annunity - interestAmount;

		for (int i = 0; i < durationInMonths; i++) {
			Calendar paymentDate = Calendar.getInstance();
			paymentDate.setTime(startDate);
			paymentDate.add(Calendar.MONTH, i);

			LoanPayment payment = new LoanPayment(annunity, PlanGenerator.dateFormatter.format(paymentDate.getTime()),
					outstandingPrincipal, interestAmount, principalAmount);
			this.paymentSchedule.add(payment);

			outstandingPrincipal = outstandingPrincipal - principalAmount;

			interestAmount = (this.interestRate * 30 / 360) * outstandingPrincipal / 100;
			principalAmount = annunity - interestAmount;
		}

	}

	public ArrayList<LoanPayment> getPlan() {
		return this.paymentSchedule;
	}

	public void printPlanCSV() {
		System.out.println(
				"borrowerPaymentAmount, date, initialOutstandingPrincipal, interest, principal, remainingOutstandingPrincipal");

		this.paymentSchedule.forEach(payment -> {
			System.out.println(PlanGenerator.decimalFormatter.format(payment.getBorrowerPaymentAmount()) + ", "
					+ payment.getPaymentDateString() + ", "
					+ PlanGenerator.decimalFormatter.format(payment.getInitialOutstandingPrincipal()) + ", "
					+ PlanGenerator.decimalFormatter.format(payment.getInterestAmount()) + ", "
					+ PlanGenerator.decimalFormatter.format(payment.getPrincipalAmount()) + ", "
					+ PlanGenerator.decimalFormatter.format(payment.getRemainingOutstandingPrincipal()));
		});
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((durationInMonths == null) ? 0 : durationInMonths.hashCode());
		result = prime * result + ((interestRate == null) ? 0 : interestRate.hashCode());
		result = prime * result + ((loanAmount == null) ? 0 : loanAmount.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlanGenerator other = (PlanGenerator) obj;
		if (durationInMonths == null) {
			if (other.durationInMonths != null)
				return false;
		} else if (!durationInMonths.equals(other.durationInMonths))
			return false;
		if (interestRate == null) {
			if (other.interestRate != null)
				return false;
		} else if (!interestRate.equals(other.interestRate))
			return false;
		if (loanAmount == null) {
			if (other.loanAmount != null)
				return false;
		} else if (!loanAmount.equals(other.loanAmount))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

}
