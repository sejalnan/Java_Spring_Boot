import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import { loginBasicAuth } from "../api/auth";
import api from "../api/axios";

function Login() {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const navigate = useNavigate();

  const login = async () => {
    try {
      await api.get("/admin");

      loginBasicAuth(username, password);
      navigate("/employees");
    } catch (error) {
      alert("Invalid username or password");
    }
  };

  return (
    <>
      <h2>Admin Login</h2>

      <input
        type="text"
        placeholder="Username"
        value={username}
        onChange={(e) => setUsername(e.target.value)}
      />

      <input
        type="password"
        placeholder="Password"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
      />

      <button onClick={login}>Login</button>
    </>
  );
}

export default Login;
