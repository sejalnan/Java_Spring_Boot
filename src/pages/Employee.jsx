import React, { useEffect } from "react";
import { useNavigate } from "react-router-dom";
import api from "../api/axios";

const Employee = () => {
  const navigate = useNavigate();
  // const [employee, setEmployee] = useState;

  const getEmployee = async () => {
    try {
      const { data } = await api.get("/employees");
      console.log(data);
    } catch (error) {
      console.error(error);
    }
  };

  useEffect(() => {
    getEmployee();
  }, []);

  return (
    <div>
      <h1>Employee </h1>

      <button onClick={() => navigate("/addemployee")}>Add Employee</button>
    </div>
  );
};

export default Employee;
