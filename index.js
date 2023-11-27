// Sample product data
const products = [
    {
      id: 1,
      name: 'Product 1',
      price: 19.99,
    },
    {
      id: 2,
      name: 'Product 2',
      price: 24.99,
    },
    // Add more products as needed
  ];
  
  // Sample shopping cart
  let cart = [];
  
  // Function to display products on the page
  function displayProducts() {
    const productContainer = document.querySelector('.featured-products');
  
    products.forEach((product) => {
      const productElement = document.createElement('div');
      productElement.classList.add('product');
      productElement.innerHTML = `
        <img src="product${product.id}.jpg" alt="${product.name}">
        <h3>${product.name}</h3>
        <p>Price: $${product.price.toFixed(2)}</p>
        <button onclick="addToCart(${product.id})">Add to Cart</button>
      `;
      productContainer.appendChild(productElement);
    });
  }
  
  // Function to add a product to the shopping cart
  function addToCart(productId) {
    const product = products.find((p) => p.id === productId);
  
    if (product) {
      cart.push(product);
      updateCart();
    }
  }
  
  // Function to update the cart display
  function updateCart() {
    const cartContainer = document.querySelector('.cart');
    cartContainer.innerHTML = '';
  
    cart.forEach((product) => {
      const cartItem = document.createElement('div');
      cartItem.classList.add('cart-item');
      cartItem.innerHTML = `
        <p>${product.name} - $${product.price.toFixed(2)}</p>
      `;
      cartContainer.appendChild(cartItem);
    });
  }
  
  // Initialize the page
  document.addEventListener('DOMContentLoaded', () => {
    displayProducts();
  });
  