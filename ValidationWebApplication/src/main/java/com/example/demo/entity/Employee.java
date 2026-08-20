package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@NotNull(message="Employee Id can not be null")
	@Positive(message="Employee id must be positive")
	private Integer empID;
	
	@NotBlank(message="name can not be blank")
	@Size(min=2,max=30,message="")
	private String name;
	
	@NotBlank(message = "Department cannot be blank")
    private String department;
	
	@NotBlank(message="Email can not be blank")
	@Email(message="Enter a valid email adress")
	private String email;
	
	 @NotBlank(message = "Mobile number cannot be blank")
	    @Pattern(
	        regexp = "^[6-9][0-9]{9}$",
	        message = "Mobile number must contain 10 digits and start with 6-9"
	    )
	    private String mobile;


	    @NotNull(message = "Age cannot be null")
	    @Min(value = 18, message = "Age must be at least 18")
	    @Max(value = 60, message = "Age cannot be greater than 60")
	    private Integer age;


	    @NotNull(message = "Salary cannot be null")
	    @Positive(message = "Salary must be positive")
	    @DecimalMin(value = "10000.00",
	                message = "Salary must be at least 10000")
	    @DecimalMax(value = "1000000.00",
	                message = "Salary cannot exceed 1000000")
	    private Double salary;


	    @NotNull(message = "Joining date cannot be null")
	    @PastOrPresent(message = "Joining date cannot be in the future")
	    private LocalDate joiningDate;


	    @PositiveOrZero(message = "Experience cannot be negative")
	    private Integer experience;


	    @AssertTrue(message = "Employee must accept company policy")
	    private boolean acceptedPolicy;

}
