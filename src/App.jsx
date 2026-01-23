import "./App.css";
import { Routes, Route } from "react-router-dom";
import ProtectedRoute from "./components/ProtectedRoute";
import Login from "./pages/loginPage";
import Employee from "./pages/Employee";
import CreateEmployee from "./pages/CreateEmployee";

function App() {
  return (
    <Routes>
      <Route path="/" element={<Login />} />

      <Route
        path="/employees"
        element={
          <ProtectedRoute>
            <Employee />
          </ProtectedRoute>
        }
      />
      <Route
        path="/employees/addemployee"
        element={
          <ProtectedRoute>
            <CreateEmployee />
          </ProtectedRoute>
        }
      />
    </Routes>
  );
}

export default App;
