package com.lendico.plangenerator.doa;

import java.io.Serializable;

public class LoanPayment implements Serializable {

	private static final long serialVersionUID = 8950806663154325939L;

	private Double borrowerPaymentAmount;
	private String paymentDateString;
	private Double initialOutstandingPrincipal;
	private Double interestAmount;
	private Double principalAmount;
	private Double remainingOutstandingPrincipal;

	private LoanPayment() {
	}

	public LoanPayment(Double borrowerPaymentAmount, String paymentDateString, Double initialOutstandingPrincipal,
			Double interestAmount, Double principalAmount) {
		super();
		this.borrowerPaymentAmount = borrowerPaymentAmount;
		this.paymentDateString = paymentDateString;
		this.initialOutstandingPrincipal = initialOutstandingPrincipal;
		this.interestAmount = interestAmount;
		this.principalAmount = principalAmount;
		this.remainingOutstandingPrincipal = initialOutstandingPrincipal - principalAmount;
		this.remainingOutstandingPrincipal = this.remainingOutstandingPrincipal < 0 ? 0.00
				: this.remainingOutstandingPrincipal;
	}

	public Double getBorrowerPaymentAmount() {
		return borrowerPaymentAmount;
	}

	public void setBorrowerPaymentAmount(Double borrowerPaymentAmount) {
		this.borrowerPaymentAmount = borrowerPaymentAmount;
	}

	public String getPaymentDateString() {
		return paymentDateString;
	}

	public void setPaymentDateString(String paymentDateString) {
		this.paymentDateString = paymentDateString;
	}

	public Double getInitialOutstandingPrincipal() {
		return initialOutstandingPrincipal;
	}

	public void setInitialOutstandingPrincipal(Double initialOutstandingPrincipal) {
		this.initialOutstandingPrincipal = initialOutstandingPrincipal;
	}

	public Double getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(Double interestAmount) {
		this.interestAmount = interestAmount;
	}

	public Double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(Double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public Double getRemainingOutstandingPrincipal() {
		return remainingOutstandingPrincipal;
	}

	public void setRemainingOutstandingPrincipal(Double remainingOutstandingPrincipal) {
		this.remainingOutstandingPrincipal = remainingOutstandingPrincipal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((borrowerPaymentAmount == null) ? 0 : borrowerPaymentAmount.hashCode());
		result = prime * result + ((initialOutstandingPrincipal == null) ? 0 : initialOutstandingPrincipal.hashCode());
		result = prime * result + ((interestAmount == null) ? 0 : interestAmount.hashCode());
		result = prime * result + ((paymentDateString == null) ? 0 : paymentDateString.hashCode());
		result = prime * result + ((principalAmount == null) ? 0 : principalAmount.hashCode());
		result = prime * result
				+ ((remainingOutstandingPrincipal == null) ? 0 : remainingOutstandingPrincipal.hashCode());
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
		LoanPayment other = (LoanPayment) obj;
		if (borrowerPaymentAmount == null) {
			if (other.borrowerPaymentAmount != null)
				return false;
		} else if (!borrowerPaymentAmount.equals(other.borrowerPaymentAmount))
			return false;
		if (initialOutstandingPrincipal == null) {
			if (other.initialOutstandingPrincipal != null)
				return false;
		} else if (!initialOutstandingPrincipal.equals(other.initialOutstandingPrincipal))
			return false;
		if (interestAmount == null) {
			if (other.interestAmount != null)
				return false;
		} else if (!interestAmount.equals(other.interestAmount))
			return false;
		if (paymentDateString == null) {
			if (other.paymentDateString != null)
				return false;
		} else if (!paymentDateString.equals(other.paymentDateString))
			return false;
		if (principalAmount == null) {
			if (other.principalAmount != null)
				return false;
		} else if (!principalAmount.equals(other.principalAmount))
			return false;
		if (remainingOutstandingPrincipal == null) {
			if (other.remainingOutstandingPrincipal != null)
				return false;
		} else if (!remainingOutstandingPrincipal.equals(other.remainingOutstandingPrincipal))
			return false;
		return true;
	}

}
