# Employee Salary Processor

This Java application automates the management of employee records by reading raw data from a binary file, calculating performance-based salary increases, and persisting the updated data as serialized objects.

## Features

* **Binary Data Processing:** Efficiently reads employee names, salaries, and service history using `DataInputStream`.
* **Automated Raise Logic:** Implements a tiered salary increase system based on current earnings and tenure.
* **Object Serialization:** Utilizes the `Serializable` interface to save full `Employee` objects to a processed data file.
* **Error Handling:** Robust handling of `EOFException` to manage the end of binary data streams.

---

## Salary Raise Logic

The system applies specific percentage increases based on the following criteria:

| Current Salary | Years of Service | Raise % |
| --- | --- | --- |
| \$30,000 | $\le 2$ years | 3.00% |
| \$30,000 | $\ge 3$ years | 2.50% |
| \$30,000.01 - \$60,000$ | $\le 5$ years | 2.25% |
| \$30,000.01 - \$60,000$ | $\ge 6$ years | 2.00% |
| \$60,000.01 - \$80,000$ | $\le 5$ years | 1.75% |
| \$60,000.01 - \$80,000$ | $\ge 6$ years | 1.50% |
| >\$80,000$ | $\le 5$ years | 2.25% |
| >\$80,000$ | $\ge 6$ years | 1.00% |

---

## Getting Started

### Prerequisites

* **Java Development Kit (JDK):** Version 8 or higher.
* **Input File:** An `employeeData.dat` file must be present in the `src/` directory containing UTF strings (names) and doubles (salary, years of service).

### Project Structure

* `Employee.java`: The model class representing an employee, containing data fields and the raise calculation logic.
* `PAssign09.java`: The main driver class that handles file I/O and processing logic.

### Usage

1. **Compile the classes:**
```bash
javac Employee.java PAssign09.java

```


2. **Run the application:**
```bash
java PAssign09

```


3. **Output:**
The program will generate `employeeDataProcessed.dat` in the `src/` folder, containing the updated `Employee` objects.

## About the Author

**Tyrone Darby**

Created: April 25, 2026

Class: 1302

```

```
