import React from "react";
import { Link } from "react-router-dom";
import { FaHome, FaPlus, FaUserAlt, FaSignOutAlt, FaGoogle } from "react-icons/fa"; // Icon imports

function Header() {
  return (
    <header className="bg-teal-600 text-white py-4 shadow-md">
      <div className="max-w-7xl mx-auto flex justify-between items-center px-6">
        {/* Left side - Website Name */}
        <h1 className="text-3xl font-bold flex items-center space-x-2">
          <span>Pay Per Go</span>
        </h1>

        {/* Centered Navigation */}
        <nav className="flex-grow flex justify-center space-x-8">
          <Link
            to="/"
            className="text-lg hover:text-teal-200 transition duration-300 flex items-center space-x-2"
          >
            <FaHome />
            <span>Home</span>
          </Link>

          <Link
            to="/add-product"
            className="text-lg hover:text-teal-200 transition duration-300 flex items-center space-x-2"
          >
            <FaPlus />
            <span>Add Product</span>
          </Link>
        </nav>

        {/* Right side - Authentication/Profile/Logout */}
        <nav className="flex space-x-6">
          <Link
            to="/Authenticate"
            className="text-lg hover:text-teal-200 transition duration-300 flex items-center space-x-2"
          >
            <FaGoogle />
            <span>GoogleAuth</span>
          </Link>

          <Link
            to="/user-profile"
            className="text-lg hover:text-teal-200 transition duration-300 flex items-center space-x-2"
          >
            <FaUserAlt />
            <span>Profile</span>
          </Link>

          <Link
            to="/logout"
            className="text-lg hover:text-teal-200 transition duration-300 flex items-center space-x-2"
          >
            <FaSignOutAlt />
            <span>Logout</span>
          </Link>
        </nav>
      </div>
    </header>
  );
}

export default Header;
