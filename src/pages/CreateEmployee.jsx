import React, { useState } from "react";
import { addEmployee } from "../api/employeeAPI";

function CreateEmployee() {
  const [form, setForm] = useState({
    name: "",
    email: "",
    phone: "",
    designation: "",
    status: "ACTIVE",
    joiningDate: "",
    salary: "",
    username: "",
    password: "",
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setForm({ ...form, [name]: value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const result = await addEmployee(form);
      console.log("Employee saved");
      alert("Employee Added Successfully");
    } catch (error) {
      console.log(error);

      alert("Error adding employee");
    }
  };

  return (
    <>
      <h2>Add Employee</h2>

      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Name"
          name="name"
          value={form.name}
          onChange={handleChange}
        />
        <br />
        <br />

        <input
          type="email"
          placeholder="Email"
          name="email"
          value={form.email}
          onChange={handleChange}
        />
        <br />
        <br />

        <input
          type="text"
          placeholder="Phone"
          name="phone"
          value={form.phone}
          onChange={handleChange}
        />
        <br />
        <br />

        <input
          type="text"
          placeholder="Designation"
          name="designation"
          value={form.designation}
          onChange={handleChange}
        />
        <br />
        <br />

        <select name="status" value={form.status} onChange={handleChange}>
          <option value="ACTIVE">ACTIVE</option>
          <option value="INACTIVE">INACTIVE</option>
        </select>
        <br />
        <br />

        <input
          type="date"
          name="joiningDate"
          value={form.joiningDate}
          onChange={handleChange}
        />
        <br />
        <br />

        <input
          type="number"
          placeholder="Salary"
          name="salary"
          value={form.salary}
          onChange={handleChange}
        />
        <br />
        <br />
        <hr />
        <h3>User Credentials</h3>
        <input
          type="text"
          placeholder="Username"
          name="username"
          value={form.username}
          onChange={handleChange}
        />
        <br />
        <br />

        <input
          type="password"
          placeholder="Password"
          name="password"
          value={form.password}
          onChange={handleChange}
        />
        <br />
        <br />

        <button type="submit">Add Employee</button>
      </form>
    </>
  );
}

export default CreateEmployee;
