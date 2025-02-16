import { useEffect, useState } from "react";
import './App.css';

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    fetch("/api/test")
      .then((response) => response.text())
      .then((data) => setMessage(data))
      .catch((error) => console.error("Error:", error));
  }, []);

  return (
    <div>
      <h1>QItApp</h1>
      <p>서버 응답: {message}</p>
      </div>
  );
}

export default App;
