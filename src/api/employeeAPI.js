import api from "./axios"
export const addEmployee = async (employeeData) => {

    api.post("/addemployee",employeeData)
}